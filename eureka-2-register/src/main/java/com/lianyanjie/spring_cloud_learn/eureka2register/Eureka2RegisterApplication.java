package com.lianyanjie.spring_cloud_learn.eureka2register;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Eureka2RegisterApplication {

    public static void main(String[] args) {
        SpringApplication.run(Eureka2RegisterApplication.class, args);
    }
}
