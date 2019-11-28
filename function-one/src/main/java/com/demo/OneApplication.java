package com.demo;

//import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan({"mapper"})  //项目启动时会扫描mapper包及子包的接口，否则会报错找不到mapper文件
//@EnableApolloConfig
public class OneApplication {

    public static void main(String[] args) {
        SpringApplication.run(OneApplication.class, args);
    }

}
