package com.market.admin.login.controller;

import com.market.admin.login.feign.LoginFeign;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @Resource
    LoginFeign loginFeign;

    @RequestMapping("/feign/login")
    public String feign_login(String account,String password) throws Exception{
        return "AdminController.login:"+account+"/"+password+loginFeign.login(account,password);
    }
    @RequestMapping("/login")
    public Object login() throws Exception{
        return "AdminController.login";
    }

}
