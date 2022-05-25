package com.swing.sky.system;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class Sky {
    public static void main(String[] args) {
        System.getProperty("spring.devtools.restart.enabled", "false");
        SpringApplication.run(Sky.class, args);
        System.out.println("Start successfully...");
    }
}