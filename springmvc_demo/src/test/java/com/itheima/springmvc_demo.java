package com.itheima;

import com.itheima.service.LinkManService;
import org.junit.Test;

public class springmvc_demo {
    private LinkManService linkManService;
    @Test
    public  void findAll(){
        linkManService.findAll();
    }
}
