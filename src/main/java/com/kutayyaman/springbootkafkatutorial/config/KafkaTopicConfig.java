package com.kutayyaman.springbootkafkatutorial.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {
    public static final String STRING_TOPIC = "string_topic";
    public static final String JSON_TOPIC = "json_topic";

    @Bean
    public NewTopic exampleTopic() {
        return TopicBuilder.name(STRING_TOPIC)
                .build();
    }

    @Bean
    public NewTopic jsonTopic() {
        return TopicBuilder.name(JSON_TOPIC)
                .build();
    }
}
