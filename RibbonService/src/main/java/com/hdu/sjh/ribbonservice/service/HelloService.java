package com.hdu.sjh.ribbonservice.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloService {
    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "helloServiceFallback")
    public String helloService() {
        return restTemplate.getForEntity("http://HELLO/hello", String.class).getBody();
    }

    public String helloServiceFallback() {
        return "error";
    }
}
