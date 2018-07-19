package com.sc.dao;

import com.sc.base.BaseTest;
import com.sc.entity.Singer;
import com.sc.entity.Style;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @Auther: hushuang
 * @Date: 2018/7/19 14:46
 * @Description:
 */
public class SingerDaoTest extends BaseTest {

    @Autowired
    private SingerDao singerDao;

    @Test
    public void addSinger() {
        Singer singer = new Singer();
        singer.setName("singer01");
        Style style = new Style();
        style.setId(1002);
        singer.setStyle(style);
        singerDao.addSinger(singer);
    }

    @Test
    public void updateSinger() {
        Singer singer = new Singer();
        singer.setId(1005);
        singer.setName("singer_02");
        singerDao.updateSinger(singer);
    }

    @Test
    public void deleteSingerById() {
        singerDao.deleteSingerById(1005);
    }

    @Test
    public void getSingerById() {
        Singer singer = singerDao.getSingerById(1004);
        System.out.println(singer);
    }

    @Test
    public void getSingers() {
        List<Singer> singers = singerDao.getSingers();
        System.out.println(singers);
    }
}