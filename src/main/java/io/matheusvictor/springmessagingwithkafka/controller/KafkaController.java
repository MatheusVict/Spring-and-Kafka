package io.matheusvictor.springmessagingwithkafka.controller;

import io.matheusvictor.springmessagingwithkafka.service.KafkaProducer;
import jakarta.websocket.server.PathParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kafka")
public class KafkaController {

    private KafkaProducer kafkaProducer;

    public KafkaController(KafkaProducer kafkaProducer) {
        this.kafkaProducer = kafkaProducer;
    }

    @GetMapping("/topic/{message}")
    public String sendMessage(@PathVariable("message") String message) {
        this.kafkaProducer.sendMessage(message);
        return "Message sent successfully";
    }
}
