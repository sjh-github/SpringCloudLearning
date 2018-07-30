package com.hdu.sjh.rabbitmq.util;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class Sender {
    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void send(String name) {
        String context = "hello " + name + ", Time is " +  new Date();
        System.out.println("Sender: " + context);
        rabbitTemplate.convertAndSend("SpringCloudDemoQueue", context);
    }
}
