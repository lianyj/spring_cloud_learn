package com.lianyanjie.spring_cloud_learn.demolearn13;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class DemoLearn13Application {

    public static void main(String[] args) {
        SpringApplication.run(DemoLearn13Application.class, args);
    }
}
