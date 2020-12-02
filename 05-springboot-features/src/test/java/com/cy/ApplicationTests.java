package com.cy;

import com.cy.pj.common.pool.ObjectPool;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ApplicationTests {
    @Autowired
    private ObjectPool objectpool;

    @Autowired
    private ObjectPool objectpool1;

    @Test
    void contextLoads() {
        System.out.println(objectpool==objectpool1);
    }

}
