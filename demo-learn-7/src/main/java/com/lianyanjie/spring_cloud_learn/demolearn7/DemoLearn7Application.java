package com.lianyanjie.spring_cloud_learn.demolearn7;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class DemoLearn7Application {

    public static void main(String[] args) {
//        new SpringApplicationBuilder(DemoLearn7Application.class).web(true).run(args);
        SpringApplication.run(DemoLearn7Application.class, args);
    }
}
