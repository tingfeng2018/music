package com.sc.test.service;

import com.sc.entity.Demo;
import com.sc.service.DemoService;
import com.sc.test.BaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @Auther: hushuang
 * @Date: 2018/7/19 10:02
 * @Description:
 */
public class DemoServiceTest extends BaseTest {

    @Autowired
    private DemoService demoService;


    @Test
    public void testGetDemoList(){
        List<Demo> demoList = demoService.getDemoList();
        System.out.println(demoList);
    }

}
