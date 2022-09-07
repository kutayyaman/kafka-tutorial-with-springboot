package com.kutayyaman.springbootkafkatutorial.kafka.consumer;

import com.kutayyaman.springbootkafkatutorial.config.KafkaTopicConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {
    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaConsumer.class);

    @KafkaListener(topics = KafkaTopicConfig.EXAMPLE_TOPIC_NAME, groupId = "myGroup")
    public void consume(String message) {
        LOGGER.info(String.format("Message received from topic:%s -> message:%s ",
                KafkaTopicConfig.EXAMPLE_TOPIC_NAME,
                message));

    }
}
