package com.lianyanjie.spring_cloud_learn.demolearn5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

@EnableHystrixDashboard
@EnableTurbine
@SpringBootApplication
public class DemoLearn5Application {

    public static void main(String[] args) {
        SpringApplication.run(DemoLearn5Application.class, args);
    }
}
