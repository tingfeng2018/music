package com.sc.dao;

import com.sc.entity.Source;

import java.util.List;

/**
 * @Auther: hushuang
 * @Date: 2018/7/19 15:05
 * @Description:
 */
public interface SourceDao {


    void addSource(Source source);


    void updateSource(Source source);


    void deleteSourceById(Integer id);



    Source getSourceById(Integer id);

    /**
     * 获取来源列表
     * @return
     */
    List<Source> getSources();

}
