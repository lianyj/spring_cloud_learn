package com.lianyanjie.spring_cloud_learn.demolearn4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
//启动类添加启用Hystrix Dashboard和熔断器

@SpringBootApplication
@EnableDiscoveryClient//启用服务注册与发现
@EnableFeignClients//启用feign进行远程调用
@EnableHystrixDashboard//启用Hystrix Dashboard和熔断器
@EnableCircuitBreaker
public class DemoLearn4Application {

    public static void main(String[] args) {
        SpringApplication.run(DemoLearn4Application.class, args);
    }
}
