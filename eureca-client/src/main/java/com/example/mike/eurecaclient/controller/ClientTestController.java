package com.example.mike.eurecaclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/main")
public class ClientTestController {

    @Value("${eureka.instance.instance-id}")
    String id;

    @GetMapping("/test")
    public String clientCall() {
        return "<html><h1>Hello, everyone! I am microservice with " + id + " id.<h1><html>";
    }
}
