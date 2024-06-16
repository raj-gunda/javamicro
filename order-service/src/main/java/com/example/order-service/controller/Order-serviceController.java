package com.example.order-service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Order-serviceController {

    @GetMapping("/")
    public String hello() {
        return "Hello from order-service!";
    }
}
