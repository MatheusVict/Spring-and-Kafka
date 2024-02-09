package io.matheusvictor.springmessagingwithkafka.service;

public interface KafkaProducer {
    void sendMessage(String message);
}
