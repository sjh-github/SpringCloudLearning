package com.hdu.sjh.rabbitmq.util;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "SpringCloudDemoQueue")
public class Receiver {
    @RabbitHandler
    public void process(String context) {
        System.out.println("Receiver: " + context);
    }
}
