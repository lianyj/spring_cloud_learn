package com.lianyanjie.spring_cloud_learn.demolearn12;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import zipkin.server.EnableZipkinServer;

@SpringBootApplication
@EnableEurekaClient
@EnableZipkinServer
public class DemoLearn12Application {

    public static void main(String[] args) {
        SpringApplication.run(DemoLearn12Application.class, args);
    }
}
