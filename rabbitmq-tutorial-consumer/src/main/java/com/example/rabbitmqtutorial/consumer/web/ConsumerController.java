package com.example.rabbitmqtutorial.consumer.web;

import lombok.AllArgsConstructor;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/consumer")
@AllArgsConstructor
public class ConsumerController {

    private final RabbitTemplate rabbitTemplate;

    @RabbitListener(queues = "string-message")
    public void receiveMessage(String message) {
        System.out.println("Received message: " + message);
    }


}
