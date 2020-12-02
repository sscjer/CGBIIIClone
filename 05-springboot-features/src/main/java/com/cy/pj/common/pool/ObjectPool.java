package com.cy.pj.common.pool;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@Lazy   //  延迟创建对象，何时需要何时创建，尤其是一些大对象，短时间内又不会用到
public class ObjectPool {
    public ObjectPool() {
        System.out.println("ObjectPool()...");
    }
}
