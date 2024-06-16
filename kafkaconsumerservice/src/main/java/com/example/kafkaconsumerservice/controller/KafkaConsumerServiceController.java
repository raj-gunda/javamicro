package com.example.kafkaconsumerservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaConsumerServiceController {

    @GetMapping("/")
    public String hello() {
        return "Hello from kafka-consumer-service!";
    }
}
