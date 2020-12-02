package com.company.pj.goods.dao;

import com.company.pj.dao.GoodsDao;
import com.company.pj.goods.service.GoodsService;
import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

/* 此对象负责商品模块的业务逻辑处理，通过数据 */
@Service
public class GoodsServiceImpl implements GoodsService {
    private static final Logger log = LoggerFactory.getLogger(GoodsServiceImpl.class);
    @Autowired
    private GoodsDao goodsdao;
    @Override
    public List<Goods> findGoods() {
        Long t1 = System.currentTimeMillis();
        log.info("start{}",t1);
        List<Goods> list = goodsdao.findGoods();
        Long t2 = System.currentTimeMillis();
        log.info("end{}",t2);
        log.info("findGoods() of waste time:{}ms",t2-t1);
        return list;
    }
}
