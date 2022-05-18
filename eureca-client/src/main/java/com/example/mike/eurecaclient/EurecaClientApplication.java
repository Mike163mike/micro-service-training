package com.example.mike.eurecaclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EurecaClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurecaClientApplication.class, args);
    }

}
