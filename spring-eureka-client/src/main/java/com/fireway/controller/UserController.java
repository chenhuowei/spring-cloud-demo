package com.fireway.controller;

import brave.sampler.Sampler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: chenhuowei
 * @Date: 2018/11/6 11:04
 * @Description:
 */
@RestController
public class UserController {

    @GetMapping("user")
     public String  user(String name){

        return "hello,[ "+name+" ],this is your user info:  age=18,sex=man,birth=2018-08.";
    }



}
