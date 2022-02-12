package com.example.springhelloworld1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringHelloWorld1Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringHelloWorld1Application.class, args);
        System.out.println("Hello World from Springboot");
    }

}
