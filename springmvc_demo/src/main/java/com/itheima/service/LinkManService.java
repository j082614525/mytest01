package com.itheima.service;

import com.itheima.pojo.LinkMan;

import java.util.List;

public interface LinkManService {
    void add(LinkMan linkMan);
    List<LinkMan> findAll();
}
