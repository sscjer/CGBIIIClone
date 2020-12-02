package com.company.pj.goods.dao;

import com.company.pj.goods.dao.Goods;
import com.company.pj.dao.GoodsDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class GoodsDaoTest {
    @Autowired
    private GoodsDao goodsdao;

    @Test
    void testGoodsDao(){
        List<Goods> list = goodsdao.findGoods();
        System.out.println(list);
    }
}
