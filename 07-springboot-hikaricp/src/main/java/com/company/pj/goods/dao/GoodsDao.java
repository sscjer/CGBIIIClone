package com.company.pj.goods.dao;

import java.util.List;
import java.util.Map;

public interface GoodsDao {
    List<Map<String,Object>> findGoods();
}
