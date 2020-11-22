package com.market.controller;

import com.market.model.Admin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {

    @RequestMapping("/lombok")
    public String lombok(){

        return new Admin(1001,"Maria",7.2).toString();
    }
}
