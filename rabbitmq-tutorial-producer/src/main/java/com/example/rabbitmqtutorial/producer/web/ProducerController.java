package com.example.rabbitmqtutorial.producer.web;

import lombok.AllArgsConstructor;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/producer")
@AllArgsConstructor
public class ProducerController {

    private final RabbitTemplate rabbitTemplate;

    @GetMapping("/string")
    public String sendMessage(@RequestParam String message) {
        rabbitTemplate.convertAndSend("string-message", message);
        return "Message sent: " + message;
    }
}
