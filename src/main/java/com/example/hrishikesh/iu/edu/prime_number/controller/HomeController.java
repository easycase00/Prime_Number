package com.example.hrishikesh.iu.edu.prime_number.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController

public class HomeController {
    @GetMapping
    public String greetings(){
        return "Welcome to the primes service_1!";
    }
}
