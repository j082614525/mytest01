package com.itheima;

import com.itheima.dao.ItemsDao;
import com.itheima.pojo.Items;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class daotest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext cpac = new ClassPathXmlApplicationContext("spring_mybatis.xml");
        ItemsDao itemsDao = (ItemsDao) cpac.getBean("itemsDao");
        List<Items> itemsList = itemsDao.list();
        System.out.println(itemsList);
    }
}
