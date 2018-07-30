package com.hdu.sjh.rabbitmq.web;

import com.hdu.sjh.rabbitmq.util.Sender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RabbitMQSenderController {
    @Autowired
    private Sender sender;

    @GetMapping(value = "/rabbitmq/send")
    public String send(@RequestParam String name) {
        sender.send(name);
        return "success";
    }
}
