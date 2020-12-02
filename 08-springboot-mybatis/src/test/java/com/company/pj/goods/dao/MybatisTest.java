package com.company.pj.goods.dao;

import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.Connection;

@SpringBootTest
public class MybatisTest {
    @Autowired
    private SqlSession sqlsession;

    @Test
    void testMybatis(){
        Connection connection = sqlsession.getConnection();
        System.err.println("connection:"+connection);
    }
}
