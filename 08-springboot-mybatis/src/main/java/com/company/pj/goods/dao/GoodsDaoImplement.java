package com.company.pj.goods.dao;

import com.company.pj.dao.GoodsDao;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class GoodsDaoImplement implements GoodsDao {
    @Autowired
    private SqlSession sqlsession;

    @Override
    public List<Goods> findGoods() {
        String statement = "com.company.pj.dao.GoodsDao.findGoods";
        return sqlsession.selectList(statement);
    }
}
