package com.market.admin.login.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "market-login")
public interface LoginFeign {

    //对于外部微服务的参数，需要指定@RequestParam注解，否则将会报错，无法启动微服务
    @RequestMapping("/login")
    String login(@RequestParam String account, @RequestParam String password) throws Exception;
}
