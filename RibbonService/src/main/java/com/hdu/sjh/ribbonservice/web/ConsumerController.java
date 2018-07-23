package com.hdu.sjh.ribbonservice.web;

import com.hdu.sjh.ribbonservice.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {

    @Autowired
    HelloService helloService;

    @GetMapping(value = "/ribbonService")
    public String helloConsumer() {
        return helloService.helloService();
    }
}
