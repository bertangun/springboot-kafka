package com.bertangun.springboot.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducer {

    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaProducer.class);

   // Springboot will provide auto configuration for the kafkaTemplate, there is no implementation(inject and use it)
   private KafkaTemplate<String, String> kafkaTemplate;

    // (key, value)
    public KafkaProducer(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendMessage(String message){
        LOGGER.info(String.format("Messsage sent %s", message));
        //first inject "" for topic parameter
        kafkaTemplate.send("queue01", message);

    }
}
