package com.company.pj.dao;

import com.company.pj.goods.dao.Goods;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface GoodsDao {
    List<Goods> findGoods();
}
