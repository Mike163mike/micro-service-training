package com.example.mike.eurecaclient.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientTestController {

    @GetMapping("/test")
    public String clientCall() {
        return "<html><h1>Hello, everyone!<h1><html>";
    }
}
