package com.hdu.sjh.eurekaclient.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class HelloController {
    @GetMapping(value = "/hello")
    public String hello(HttpServletRequest request) {
        return "hello! URL: " + request.getRequestURL();
    }
}
