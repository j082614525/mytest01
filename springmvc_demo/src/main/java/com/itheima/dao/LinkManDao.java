package com.itheima.dao;

import com.itheima.pojo.LinkMan;

import java.util.List;

public interface LinkManDao {
    void add(LinkMan linkMan);
    List<LinkMan> findAll();
}
