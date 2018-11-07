package com.fireway.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: chenhuowei
 * @Date: 2018/11/6 11:04
 * @Description:
 */
@RestController
public class HelloController {

    @Value("${server.port}")
    private String port;

    @GetMapping("hi")
    public String home(@RequestParam(value = "name", defaultValue = "fireway") String name) {
        return "hi " + name + " ,i am from port:" + port;
    }



}
