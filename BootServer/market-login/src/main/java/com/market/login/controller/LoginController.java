package com.market.login.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @RequestMapping("/login")
    public String login(String account,String password) throws Exception{
        return "LoginController.login:"+account+"/"+password;
    }
}
