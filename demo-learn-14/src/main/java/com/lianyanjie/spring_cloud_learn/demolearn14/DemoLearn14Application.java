package com.lianyanjie.spring_cloud_learn.demolearn14;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class DemoLearn14Application {

    public static void main(String[] args) {
        SpringApplication.run(DemoLearn14Application.class, args);
    }
}
