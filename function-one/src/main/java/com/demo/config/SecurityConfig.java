package com.demo.config;

import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


/**
 * spring security配置
 */
@EnableGlobalMethodSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(HttpSecurity http) throws Exception {

		http.authorizeRequests()
                //需要登录，并拥有着角色ADMIN的才可访问/admin/**（会报403，即授权失败，认证失败是401）；不用登录可直接访问/app/**
                .antMatchers("/admin/**").hasRole("ADMIN")
                .antMatchers("/user/**").hasRole("USER")
                .antMatchers("/app/**").permitAll()
				.anyRequest( ).authenticated()
				.and()
			.formLogin()
                //security提供了一个默认的表单登录页，这里我们自定义登录页，并使其不受限访问
				.loginPage("/myLogin.html")
				    //指定处理登录请求的路径
					.loginProcessingUrl("/login")
				    //指定登录成功时的处理
				    .successHandler(new AuthenticationSuccessHandler() {
						@Override
						public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException, ServletException {
							//登录成功，携带Authentication，含有登录用户的信息
							response.setContentType("application/json;charset=UTF-8");
							PrintWriter out = response.getWriter();
							out.write("{\"code\":\"0000\",\"message\":\"欢迎登录系统!\"}");
						}
					})
				    //指定登录失败时的处理
				    .failureHandler(new AuthenticationFailureHandler(){
						@Override
						public void onAuthenticationFailure(HttpServletRequest request, HttpServletResponse response, AuthenticationException exception) throws IOException, ServletException {
							//登录失败，携带AuthenticationException
							response.setContentType("application/json;charset=UTF-8");
							response.setStatus(401);
							PrintWriter out = response.getWriter();
							out.write("{\"code\":\"401\",\"name\":\""+exception.getClass()+"\",\"message\":\""+exception.getMessage()+"\"}");
						}
					})
				.permitAll()
				.and()
		    .csrf().disable();

	}


}
