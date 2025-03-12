package com.questk2.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.questk2")
public class Appconfiguration {

    @Bean
    public String orgName() {
        return "questk2";
    }
    @Bean
    public String deptName() {
        return "development";
    }
}
