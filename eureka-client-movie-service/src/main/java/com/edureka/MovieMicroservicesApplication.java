package com.edureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MovieMicroservicesApplication {

    public static void main(String[] args) {
        SpringApplication.run(MovieMicroservicesApplication.class, args);
    }
}
