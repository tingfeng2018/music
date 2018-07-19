package com.sc.dao;

import com.sc.entity.Demo;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Auther: hushuang
 * @Date: 2018/7/19 09:42
 * @Description:
 */
@Repository
public interface DemoDao {

    List<Demo> getDemoList();

}
