package com.kutayyaman.springbootkafkatutorial.kafka.producer;

import com.kutayyaman.springbootkafkatutorial.config.KafkaTopicConfig;
import com.kutayyaman.springbootkafkatutorial.dto.MessageDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

@Service
public class JsonKafkaProducer {
    private static final Logger LOGGER = LoggerFactory.getLogger(JsonKafkaProducer.class);

    private final KafkaTemplate<String, MessageDTO> kafkaTemplate;

    public JsonKafkaProducer(KafkaTemplate<String, MessageDTO> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendMessage(MessageDTO messageDTO) {
        LOGGER.info(String.format("Message sent -> %s", messageDTO.toString()));
        Message<MessageDTO> message = MessageBuilder
                .withPayload(messageDTO)
                .setHeader(KafkaHeaders.TOPIC, KafkaTopicConfig.EXAMPLE_TOPIC_NAME)
                .build();

        kafkaTemplate.send(message);
    }
}
