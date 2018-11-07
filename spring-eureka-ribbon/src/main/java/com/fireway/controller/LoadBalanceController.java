package com.fireway.controller;

import com.fireway.service.LoadBalanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: chenhuowei
 * @Date: 2018/11/6 11:02
 * @Description:
 */
@RestController
public class LoadBalanceController {

    @Autowired
    private LoadBalanceService loadBalanceService;

    @GetMapping("user")
    public String userClient(String name){

        return this.loadBalanceService.user(name);
    }

    @GetMapping("order")
    public String orderClient0(String name){

        return this.loadBalanceService.order(name);
    }




}
