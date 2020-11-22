package com.market.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RedisHostController {

    @Autowired
    private RedisTemplate<String,String> redisTemplate;

    @RequestMapping("/redis")
    public String redisHost(){
        String tk="tkey";
        String ss="redis success value";
        redisTemplate.opsForValue().set(tk,ss);
        ss=""+redisTemplate.hasKey(tk);
        ss=redisTemplate.opsForValue().get(tk);
        redisTemplate.delete(tk);
        ss+=redisTemplate.hasKey(tk);
        return ss;

    }
}
