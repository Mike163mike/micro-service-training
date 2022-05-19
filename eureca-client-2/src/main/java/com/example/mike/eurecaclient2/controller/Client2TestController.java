package com.example.mike.eurecaclient2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/second")
public class Client2TestController {

    @GetMapping("/secondTest")
    public String secondClientCall() {
        return "<html><h1>Hello, everyone from second microservice!<h1><html>";
    }
}
