package com.fireway.controller;

import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * @Author: chenhuowei
 * @Date: 2018/11/7 15:43
 * @Description:
 */
@Controller
public class IndexController {


    @GetMapping("hystrix")
    public String hystrixPage(HttpServletRequest request) throws Exception{
        int port = request.getLocalPort();
        String ipPort = "127.0.0.1:"+port;
        return "redirect:http://"+ipPort+"/hystrix/monitor?stream=http://"+ipPort+"/turbine.stream&delay=2000&title=aa";
    }
    @GetMapping("zipkin")
    public String zipkinPage(String port){
        return "redirect:http://localhost:9411";
    }
}
