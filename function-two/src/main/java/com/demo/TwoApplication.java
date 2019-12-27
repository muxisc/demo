package com.demo;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan({"mapper"})
@EnableApolloConfig
public class TwoApplication {

    public static void main(String[] args) {
        SpringApplication.run(TwoApplication.class, args);
    }

}
