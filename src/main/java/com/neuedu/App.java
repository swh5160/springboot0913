package com.neuedu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author 施子安
 * @create
 */
@SpringBootApplication
@MapperScan("com.neuedu.mapper")
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class);
    }
}
