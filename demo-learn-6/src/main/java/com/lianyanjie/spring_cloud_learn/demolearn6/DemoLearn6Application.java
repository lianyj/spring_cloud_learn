package com.lianyanjie.spring_cloud_learn.demolearn6;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class DemoLearn6Application {

    public static void main(String[] args) {
        SpringApplication.run(DemoLearn6Application.class, args);
    }
}
