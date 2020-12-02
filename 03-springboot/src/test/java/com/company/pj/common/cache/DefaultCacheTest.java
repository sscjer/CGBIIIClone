package com.company.pj.common.cache;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class DefaultCacheTest {
    @Autowired
    private DefaultCache defaultcache;

    @Test
    void CacheTest(){           //springboot单元测试默认public
        System.out.println(defaultcache.toString());
    }
}
