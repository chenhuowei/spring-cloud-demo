package com.fireway.controller;

import com.fireway.common.entity.ApiResponseModel;
import com.fireway.common.utils.ResponseModelUtil;
import com.fireway.entity.MenuEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


/**
 * @Author: chenhuowei
 * @Date: 2018/11/8 11:04
 * @Description:
 */
@RestController
@RequestMapping("home")
public class HomeDataController {

    @GetMapping("menu")
    public ApiResponseModel menu(){


        return ResponseModelUtil.success("",this.getMenu());
    }

    private List<MenuEntity> getMenu(){
        List<MenuEntity> list = new ArrayList<>(1);
        MenuEntity menu = new MenuEntity("1","系统管理",Boolean.TRUE,"","",Boolean.TRUE);
        menu.getChildren().add(new MenuEntity("2","hystrix断路监控",Boolean.FALSE,"",
                "http://localhost:8764/hystrix",Boolean.TRUE));
        menu.getChildren().add(new MenuEntity("3","zipkin链路监控",Boolean.FALSE,"",
                "http://localhost:8764/zipkin",Boolean.TRUE));
        menu.getChildren().add(new MenuEntity("4","eureka服务监控",Boolean.FALSE,"",
                "http://localhost:8761",Boolean.TRUE));
        menu.getChildren().add(new MenuEntity("5","用户管理",Boolean.FALSE,"",
                "user",Boolean.TRUE));
        menu.getChildren().add(new MenuEntity("6","订单管理",Boolean.FALSE,"",
                "order",Boolean.TRUE));
        menu.getChildren().add(new MenuEntity("7","axios",Boolean.FALSE,"",
                "https://www.kancloud.cn/yunye/axios/234845",Boolean.TRUE));
        list.add(menu);
        return  list;
    }


}
