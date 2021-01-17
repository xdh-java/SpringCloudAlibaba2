package com.java.xdh.service;

/**
 * @author 薛登辉
 * @time 2021/1/17 0017 14:55
 * @description 这是我的代码风格
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class Pay {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void savePay(){
        String sql = "insert into `pay`(name, birthday) values ('李四','1998-11-30')";
        jdbcTemplate.update(sql);
    }

}
