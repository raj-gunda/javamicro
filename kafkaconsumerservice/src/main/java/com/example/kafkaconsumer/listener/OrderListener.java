package com.example.kafkaconsumer.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class OrderListener {

    @KafkaListener(topics = "orders", groupId = "group_id")
    public void listen(String message) {
        System.out.println("Received Message: " + message);
    }
}
