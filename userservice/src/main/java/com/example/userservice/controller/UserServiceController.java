package com.example.userservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserServiceController {

    @GetMapping("/")
    public String hello() {
        return "Hello from user-service!";
    }
}
