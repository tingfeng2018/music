package com.sc.controller;

import com.sc.entity.Demo;
import com.sc.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @Auther: hushuang
 * @Date: 2018/7/19 10:00
 * @Description:
 */
@Controller
public class DemoController {


    @Autowired
    private DemoService demoService;

    @RequestMapping("/test")
    public  String test(Model model){
        List<Demo> list = demoService.getDemoList();
        model.addAttribute("list",list);
        return "test";
    }

}
