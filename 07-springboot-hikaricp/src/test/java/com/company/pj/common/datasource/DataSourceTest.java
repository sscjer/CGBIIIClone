package com.company.pj.common.datasource;

import com.company.pj.goods.dao.GoodsDao;
import com.zaxxer.hikari.HikariDataSource;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

@SpringBootTest
public class DataSourceTest {
    @Autowired
    private HikariDataSource datasource;
    @Autowired
    private GoodsDao goodsdao;

    @Test
    void testGetConnection() throws SQLException {
        Connection connection = datasource.getConnection();
        System.out.println(datasource.getConnection().getClass().getName());
    }

    @Test
    void TestFindGoods() {
        List<Map<String, Object>> list = goodsdao.findGoods();
        for (Map<String,Object> map: list) {
            System.out.println(map);
        }
    }
}
