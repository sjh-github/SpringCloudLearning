package com.hdu.sjh.configclient.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InfoController {
    @Value("${info.from}")
    private String info;

    @GetMapping(value = "/info")
    public String getInfo() {
        return info;
    }
}
