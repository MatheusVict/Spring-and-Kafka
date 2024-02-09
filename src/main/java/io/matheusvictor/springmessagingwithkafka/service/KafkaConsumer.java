package io.matheusvictor.springmessagingwithkafka.service;

public interface KafkaConsumer {
    void receiveMessage(String message);
}
