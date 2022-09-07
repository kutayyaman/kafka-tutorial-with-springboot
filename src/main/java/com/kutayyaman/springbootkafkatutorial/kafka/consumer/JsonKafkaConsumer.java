package com.kutayyaman.springbootkafkatutorial.kafka.consumer;

import com.kutayyaman.springbootkafkatutorial.config.KafkaTopicConfig;
import com.kutayyaman.springbootkafkatutorial.dto.MessageDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class JsonKafkaConsumer {
    private static final Logger LOGGER = LoggerFactory.getLogger(JsonKafkaConsumer.class);

    @KafkaListener(topics = KafkaTopicConfig.JSON_TOPIC, groupId = "myGroup")
    public void consume(MessageDTO messageDTO) {
        LOGGER.info(String.format("JSON Message received from topic:%s -> message:%s ",
                KafkaTopicConfig.JSON_TOPIC,
                messageDTO.toString()));
    }
}
