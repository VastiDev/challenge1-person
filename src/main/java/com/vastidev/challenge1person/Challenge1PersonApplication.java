package com.vastidev.challenge1person;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/")
public class Challenge1PersonApplication {

    @GetMapping
    public String getHomeTeste(){
        return "Challenge1-person API Home";
    }

    public static void main(String[] args) {
        SpringApplication.run(Challenge1PersonApplication.class, args);
    }

}
