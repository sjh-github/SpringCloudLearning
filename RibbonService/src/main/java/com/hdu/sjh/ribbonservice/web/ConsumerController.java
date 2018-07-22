package com.hdu.sjh.ribbonservice.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerController {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping(value = "/ribbonService")
    public String helloConsumer() {
        return restTemplate.getForEntity("http://HELLO/hello", String.class).getBody();
    }
}
