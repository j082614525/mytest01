package com.itheima;

import com.itheima.pojo.Items;
import com.itheima.service.ItemsService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class servicetest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext cpac = new ClassPathXmlApplicationContext("spring_service.xml");
        ItemsService itemsService = (ItemsService) cpac.getBean("itemsServiceImpl");
        Items items = new Items();
        items.setName("测试事物");
        itemsService.save(items);
    }
}
