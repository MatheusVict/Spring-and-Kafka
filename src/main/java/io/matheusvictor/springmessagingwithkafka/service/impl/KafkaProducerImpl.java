package io.matheusvictor.springmessagingwithkafka.service.impl;

import io.matheusvictor.springmessagingwithkafka.service.KafkaProducer;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducerImpl implements KafkaProducer {
    private KafkaTemplate<String, String> kafkaTemplate;

    public KafkaProducerImpl(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }


    @Override
    public void sendMessage(String message) {
        kafkaTemplate.send("first-topic", message);
    }
}
