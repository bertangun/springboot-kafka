package com.bertangun.springboot.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class kafkaTopicConfig {

    @Bean
    public NewTopic queue01Topic() {

        // create the topic instance
        return TopicBuilder.name("queue01")
                .build();
    }

    @Bean
    public NewTopic queue01JsonTopic() {

        // create the json topic instance
        return TopicBuilder.name("queue01_json")
                .build();

    }


}
