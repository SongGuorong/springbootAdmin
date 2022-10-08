package com.sgr.springboot.lab24;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    // 文档访问路径：http://localhost:8080/swagger-ui.html
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
