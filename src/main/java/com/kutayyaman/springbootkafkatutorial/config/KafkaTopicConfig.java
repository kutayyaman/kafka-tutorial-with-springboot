package com.kutayyaman.springbootkafkatutorial.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {
    public static final String exampleTopicName = "example";

    @Bean
    public NewTopic exampleTopic() {
        return TopicBuilder.name(exampleTopicName)
                .build();
    }
}
