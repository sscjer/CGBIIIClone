package com.company.pj.goods.dao;

import java.util.Date;

public class Goods {
    private Long id;
    private String remark;
    private String name;
    private Date createdTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date reatedTime) {
        this.createdTime = reatedTime;
    }

    public String toString(){
        return "Goods [id="+id+",name="+name+",remark="+remark+",reatedTime="+createdTime+"]";
    }
}
