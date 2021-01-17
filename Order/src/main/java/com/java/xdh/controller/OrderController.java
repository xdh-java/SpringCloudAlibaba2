package com.java.xdh.controller;

import com.java.xdh.service.OrderService;
import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author 薛登辉
 * @time 2021/1/17 0017 14:56
 * @description 这是我的代码风格
 */
@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/save")
    @GlobalTransactional
    public String save(){
        //订单
        this.orderService.saveOrder();
        //通过restTemplate去调用别的请求
        int i = 10/0;
        //支付
        this.restTemplate.getForObject("http://localhost:8020/save",String.class);
        return "成功";
    }




}
