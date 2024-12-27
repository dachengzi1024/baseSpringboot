package com.cxm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.cxm.dao")
public class BaseSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(BaseSpringApplication.class, args);
    }

}
