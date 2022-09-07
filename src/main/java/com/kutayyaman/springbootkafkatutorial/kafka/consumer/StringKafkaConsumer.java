package com.kutayyaman.springbootkafkatutorial.kafka.consumer;

import com.kutayyaman.springbootkafkatutorial.config.KafkaTopicConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class StringKafkaConsumer {
    private static final Logger LOGGER = LoggerFactory.getLogger(StringKafkaConsumer.class);

    @KafkaListener(topics = KafkaTopicConfig.STRING_TOPIC, groupId = "myGroup")
    public void consume(String message) {
        LOGGER.info(String.format("Message received from topic:%s -> message:%s ",
                KafkaTopicConfig.STRING_TOPIC,
                message));

    }
}
