package com.sc.test.dao;

import com.sc.dao.DemoDao;
import com.sc.entity.Demo;
import com.sc.test.BaseTest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @Auther: hushuang
 * @Date: 2018/7/19 09:45
 * @Description:
 */

public class DemoDaoTest extends BaseTest {

    @Autowired
    private DemoDao demoDao;

    @Test
    public void testGetDemoList(){

        List<Demo> list = demoDao.getDemoList();
        System.out.println(list);
    }


}
