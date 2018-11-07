package com.fireway.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: chenhuowei
 * @Date: 2018/11/6 10:59
 * @Description:
 */
@Service
public class LoadBalanceService {

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "userError")
    public String user(String name){
        return  restTemplate.getForObject("http://eureka-client-user/user?name="+name,String.class);
    }

    @HystrixCommand(fallbackMethod = "orderError")
    public String order(String name){
        return  restTemplate.getForObject("http://eureka-client-order/order?name="+name,String.class);
    }

    public String userError(String name){

        return "[user] service is error!";
    }
    public String orderError(String name){

        return "[order] service is error!";
    }


}
