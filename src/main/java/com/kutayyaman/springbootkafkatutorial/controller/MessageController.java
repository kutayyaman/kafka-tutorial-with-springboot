package com.kutayyaman.springbootkafkatutorial.controller;

import com.kutayyaman.springbootkafkatutorial.dto.MessageDTO;
import com.kutayyaman.springbootkafkatutorial.kafka.producer.KafkaProducer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/kafka")
public class MessageController {
    private final KafkaProducer kafkaProducer;

    public MessageController(KafkaProducer kafkaProducer) {
        this.kafkaProducer = kafkaProducer;
    }

    @PostMapping("/publish")
    public ResponseEntity<String> publish(@RequestBody MessageDTO message) {
        kafkaProducer.sendMessage(message.getBody());
        return ResponseEntity.ok("Message sent to the topic");
    }
}
