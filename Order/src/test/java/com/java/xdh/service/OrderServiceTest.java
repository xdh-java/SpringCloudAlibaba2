package com.java.xdh.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * @author 薛登辉
 * @time 2021/1/17 0017 17:16
 * @description 这是我的代码风格
 */
@SpringBootTest
class OrderServiceTest {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Test
    void saveOrder() {
        String sql = "insert into `order`(name, birthday) values ('李四','1999-11-30')";
        jdbcTemplate.update(sql);

    }
}