package com.company.pj.goods.dao;

import com.company.pj.goods.service.GoodsService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class GoodsServiceTest {
    @Autowired
    private GoodsService goodservice;

    @Test
    void testService() {
        List<Goods> list = goodservice.findGoods();
        list.forEach(item -> System.err.println(item));
    }
}
