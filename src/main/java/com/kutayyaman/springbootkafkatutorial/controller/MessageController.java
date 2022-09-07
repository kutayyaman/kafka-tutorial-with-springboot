package com.kutayyaman.springbootkafkatutorial.controller;

import com.kutayyaman.springbootkafkatutorial.dto.MessageDTO;
import com.kutayyaman.springbootkafkatutorial.kafka.producer.StringKafkaProducer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/kafka")
public class MessageController {
    private final StringKafkaProducer stringKafkaProducer;

    public MessageController(StringKafkaProducer stringKafkaProducer) {
        this.stringKafkaProducer = stringKafkaProducer;
    }

    @PostMapping("/publish")
    public ResponseEntity<String> publish(@RequestBody MessageDTO message) {
        stringKafkaProducer.sendMessage(message.getBody());
        return ResponseEntity.ok("Message sent to the topic");
    }
}
