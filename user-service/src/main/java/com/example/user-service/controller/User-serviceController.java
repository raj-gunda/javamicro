package com.example.user-service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class User-serviceController {

    @GetMapping("/")
    public String hello() {
        return "Hello from user-service!";
    }
}
