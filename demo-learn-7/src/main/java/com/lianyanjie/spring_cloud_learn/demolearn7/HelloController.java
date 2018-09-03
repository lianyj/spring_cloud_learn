package com.lianyanjie.spring_cloud_learn.demolearn7;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



/**
 * @author: lyj
 * @since: 2018/8/21
 */
@RestController
public class HelloController {

    @Value("${hello}")
    private String hello;

    @RequestMapping("/hello")
    public String from() {
        return this.hello;
    }
}
