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
public class OrderController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("order")
    public String order( String name) {
        String user = this.restTemplate.getForObject("http://localhost:8764/user/info?name="+name,String.class);
        return  "hi,["+name+"],this is your order info: product_name=iphone x,price=$999,color=red."+"your userinfo={"+user+"}";
    }
    @GetMapping("order/list")
    public String orderList( String name) {
        return  "*** ["+name+"],this is your order info: product_name=iphone x,price=$999,color=red.";
    }



}
