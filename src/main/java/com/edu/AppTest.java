package com.edu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = {"com.edu.mapper"})
public class AppTest {
    public static void main(String[] args) {
        SpringApplication.run(AppTest.class,args);
    }

}
