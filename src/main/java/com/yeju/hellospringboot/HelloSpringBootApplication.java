package com.yeju.hellospringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloSpringBootApplication {

    public static void main(String[] args) {
        System.out.println("yeju spirng");
        SpringApplication.run(HelloSpringBootApplication.class, args);
    }

}
