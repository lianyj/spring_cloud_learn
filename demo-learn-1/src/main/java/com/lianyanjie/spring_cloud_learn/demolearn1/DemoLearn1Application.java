package com.lianyanjie.spring_cloud_learn.demolearn1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class DemoLearn1Application {

    public static void main(String[] args) {
        SpringApplication.run(DemoLearn1Application.class, args);
    }
}
