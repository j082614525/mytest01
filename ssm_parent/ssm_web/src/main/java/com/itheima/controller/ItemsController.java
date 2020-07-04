package com.itheima.controller;

import com.itheima.pojo.Items;
import com.itheima.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("items")
public class ItemsController {
    @Autowired
    private ItemsService itemsService;

    @RequestMapping("/list")
    public String list(Model model){
        List<Items> items = itemsService.list();
        model.addAttribute("items",items);
//        model.addAttribute("items",items);
        return "items";
    }

    @RequestMapping("/list2")
    public ModelAndView list(){
        ModelAndView modelAndView = new ModelAndView();
        List<Items> list = itemsService.list();
        modelAndView.addObject("items",list);
        modelAndView.setViewName("items");
        return modelAndView;
    }

    @RequestMapping("/save")
   public String save(Items items ){
        int all = itemsService.save(items);
        return "redirect:/items/list";
    }

}
