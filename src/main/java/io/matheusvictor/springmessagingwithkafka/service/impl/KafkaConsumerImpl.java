package io.matheusvictor.springmessagingwithkafka.service.impl;

import io.matheusvictor.springmessagingwithkafka.service.KafkaConsumer;
import lombok.extern.log4j.Log4j2;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Log4j2
public class KafkaConsumerImpl implements KafkaConsumer {
    @KafkaListener(topics = "first-topic", groupId = "group-1")
    @Override
    public void receiveMessage(String message) {
        log.info("Consumer message arrived " + message);
    }
}
