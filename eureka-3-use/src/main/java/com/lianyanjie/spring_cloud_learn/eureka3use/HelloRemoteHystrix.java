package com.lianyanjie.spring_cloud_learn.eureka3use;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**熔断
 * @author: lyj
 * @since: 2018/8/8
 */
@Component//创建回调类
public class HelloRemoteHystrix implements HelloRemote {

    @Override
    public String hello(@RequestParam(value = "name")String name){
        return "hello" +name+", this messge send failed ";
    }
}
