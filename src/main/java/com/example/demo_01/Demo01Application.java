package com.example.demo_01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Demo01Application {

    public static void main(String[] args) {

        SpringApplication.run(Demo01Application.class, args);
    }

    @GetMapping("/")
    public String hello(){
        return "Hello Abel, nice to meet you";
    }

}
