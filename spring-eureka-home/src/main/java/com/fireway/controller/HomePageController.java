package com.fireway.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Author: chenhuowei
 * @Date: 2018/11/6 11:04
 * @Description:
 */
@Controller
public class HomePageController {

    @GetMapping("/")
    public String index(){
        return "index";
    }
    @GetMapping("login")
    public String login(){
        return "login";
    }
    @GetMapping("menu")
    public String menu(){
        return "menu";
    }
    @GetMapping("home")
    public String home(){
        return "home";
    }
    @GetMapping("user")
    public String user(){
        return "user";
    }
    @GetMapping("order")
    public String order(){
        return "order";
    }


}
