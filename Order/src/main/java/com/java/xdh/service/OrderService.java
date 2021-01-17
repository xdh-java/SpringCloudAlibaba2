package com.java.xdh.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

/**
 * @author 薛登辉
 * @time 2021/1/17 0017 14:49
 * @description 这是我的代码风格
 */
@Service
public class OrderService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    //插入数据
    public void saveOrder(){
        String sql = "insert into `order`(name, birthday) values ('王八蛋','2020-11-30')";
        jdbcTemplate.update(sql);

    }


}
