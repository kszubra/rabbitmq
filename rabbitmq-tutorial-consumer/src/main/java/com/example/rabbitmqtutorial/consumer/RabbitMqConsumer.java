package com.example.rabbitmqtutorial.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RabbitMqConsumer {

    public static void main(String[] args) {
        SpringApplication.run(RabbitMqConsumer.class, args);
    }

}