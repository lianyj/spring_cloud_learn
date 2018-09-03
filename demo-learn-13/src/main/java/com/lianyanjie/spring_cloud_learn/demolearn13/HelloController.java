package com.lianyanjie.spring_cloud_learn.demolearn13;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: lyj
 * @since: 2018/8/17
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello() {
        return "helle consul1";
    }

}
