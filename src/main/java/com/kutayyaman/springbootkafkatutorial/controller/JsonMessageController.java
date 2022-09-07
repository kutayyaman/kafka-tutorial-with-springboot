package com.kutayyaman.springbootkafkatutorial.controller;

import com.kutayyaman.springbootkafkatutorial.dto.MessageDTO;
import com.kutayyaman.springbootkafkatutorial.kafka.producer.JsonKafkaProducer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/kafka/json-message")
public class JsonMessageController {
    private final JsonKafkaProducer jsonKafkaProducer;

    public JsonMessageController(JsonKafkaProducer jsonKafkaProducer) {
        this.jsonKafkaProducer = jsonKafkaProducer;
    }

    @PostMapping("/publish")
    public ResponseEntity<String> publish(@RequestBody MessageDTO messageDTO) {
        jsonKafkaProducer.sendMessage(messageDTO);
        return ResponseEntity.ok("Json Message sent to the topic");
    }
}
