package com.sc.service;

import com.sc.dao.DemoDao;
import com.sc.entity.Demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Auther: hushuang
 * @Date: 2018/7/19 10:00
 * @Description:
 */
@Service

public class DemoService {

    @Autowired
    private DemoDao demoDao;

    @Transactional(readOnly = true)
    public List<Demo> getDemoList(){
        return demoDao.getDemoList();
    }
}
