package com.fireway.controller;

import brave.sampler.Sampler;
import com.fireway.utils.LoggerUtil;
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

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("user")
     public String  user(String name){
        String order = this.restTemplate.getForObject("http://localhost:8764/order/list?name="+name,String.class);
        LoggerUtil.info(order,UserController.class);
        return "hello,[ "+name+" ],this is your user info:  age=18,sex=man,birth=2018-08."+"your order={"+order+"}";
    }
    @GetMapping("user/info")
     public String  order(String name){
        return "*** [ "+name+" ],this is your user info:  age=18,sex=man,birth=2018-08.";
    }



}
