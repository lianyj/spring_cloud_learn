package com.lianyanjie.spring_cloud_learn.eureka3use;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * 服务调用
 */

@SpringBootApplication
@EnableDiscoveryClient//启用服务注册与发现
@EnableFeignClients//启用feign进行远程调用
public class Eureka3UseApplication {

    public static void main(String[] args) {
        SpringApplication.run(Eureka3UseApplication.class, args);
    }
}
