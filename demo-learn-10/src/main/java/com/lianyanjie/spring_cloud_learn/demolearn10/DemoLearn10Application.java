package com.lianyanjie.spring_cloud_learn.demolearn10;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableZuulProxy
public class DemoLearn10Application {

    @Bean
    public TokenFilter tokenFilter() {
        return new TokenFilter();
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoLearn10Application.class, args);
    }
}
