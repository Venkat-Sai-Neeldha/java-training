package com.springboot1.restapi.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.springboot1.restapi.repository")
@EntityScan("com.springboot1.restapi.entity")
@ComponentScan("com.springboot1.restapi")
public class SpringBootRestApiProjectApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootRestApiProjectApplication.class, args);
    }
}
