package com.lianyanjie.spring_cloud_learn.eureka3use;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**feign调用实现
 * @author: lyj
 * @since: 2018/8/8
 */
@FeignClient(name = "spring-cloud-producer",fallback = HelloRemoteHystrix.class)//添加fallback属性
public interface HelloRemote {

    @RequestMapping("/hello")
    public String hello(@RequestParam(value = "name")String name);

    //name:远程服务名，及spring.application.name配置的名称
    //此类中的方法和远程服务中contoller中的方法名和参数需保持一致。
}
