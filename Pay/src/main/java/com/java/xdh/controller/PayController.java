package com.java.xdh.controller;

import com.java.xdh.service.Pay;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 薛登辉
 * @time 2021/1/17 0017 15:01
 * @description 这是我的代码风格
 */
@RestController
public class PayController {

    @Autowired
    private Pay payService;
    @GetMapping("/save")
    public String save(){
        this.payService.savePay();
        return "pay方法已经成功";
    }

}
