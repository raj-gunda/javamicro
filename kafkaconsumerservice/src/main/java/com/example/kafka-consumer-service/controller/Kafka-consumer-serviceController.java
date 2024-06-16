package com.example.kafka-consumer-service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Kafka-consumer-serviceController {

    @GetMapping("/")
    public String hello() {
        return "Hello from kafka-consumer-service!";
    }
}
