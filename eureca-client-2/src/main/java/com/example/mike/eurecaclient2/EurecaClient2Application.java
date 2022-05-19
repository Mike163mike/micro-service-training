package com.example.mike.eurecaclient2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EurecaClient2Application {

    public static void main(String[] args) {
        SpringApplication.run(EurecaClient2Application.class, args);
    }

}
