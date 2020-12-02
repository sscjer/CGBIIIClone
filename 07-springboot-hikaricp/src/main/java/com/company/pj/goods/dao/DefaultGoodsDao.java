package com.company.pj.goods.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class DefaultGoodsDao implements GoodsDao {
    @Autowired
    private DataSource datasource;

    //初始化一个日志对象（所有类都在org.slf4j包中）
    private static final Logger log = LoggerFactory.getLogger(DefaultGoodsDao.class);

    public List<Map<String, Object>> findGoods() {
        Connection connection = null;
        Statement statement = null;
        ResultSet result = null;
        try {
            connection = datasource.getConnection();
            statement = connection.createStatement();
            String sql = "select * from tb_goods";
            result = statement.executeQuery(sql);
//            List<Map<String, Object>> list = new ArrayList<>();
//            while (result.next()) {
//                Map<String, Object> map = new HashMap<>();
//                map.put("id", result.getInt("id"));
//                map.put("name", result.getString("name"));
//                map.put("remark", result.getString("remark"));
//                map.put("createdTime", result.getString("createdTime"));
//                list.add(map);
//            }

            ResultSetMetaData rsmd = result.getMetaData();
            Map<String, Object> map = new HashMap<>();
            int column = rsmd.getColumnCount();
            List<Map<String, Object>> list = new ArrayList();
            for (int i = 1; i <= column; i++) {
                map.put(rsmd.getColumnName(i), result.getObject(rsmd.getColumnLabel(i)));
                list.add(map);
            }
            return list;
        } catch (Exception e) {
//            e.getStackTrace();
            //记录日志（一般异常日志借助log.error方法进行记录）
            log.error("查询异常,{}", e.getMessage());    //{}:占位符
            throw new RuntimeException("查询失败！", e);
        } finally {
            try {
                statement.close();
                connection.close();
                result.close();
            } catch (Exception e) {
                e.getStackTrace();
            }
        }
    }
}
