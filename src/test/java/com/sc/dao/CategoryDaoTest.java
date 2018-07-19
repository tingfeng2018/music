package com.sc.dao;

import com.sc.base.BaseTest;
import com.sc.entity.Category;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @Auther: hushuang
 * @Date: 2018/7/19 14:23
 * @Description:
 */
public class CategoryDaoTest extends BaseTest {

    @Autowired
    private CategoryDao categoryDao;


    @Test
    public void addCategory() {
        Category category = new Category();
        category.setName("摇滚_");

        categoryDao.addCategory(category);
    }

    @Test
    public void updateCategory() {
        Category category = new Category();
        category.setId(1005);
        category.setName("摇滚");
        categoryDao.updateCategory(category);
    }

    @Test
    public void deleteCategoryById() {
        categoryDao.deleteCategoryById(1001);
    }

    @Test
    public void getCategoryById() {
        Category category = categoryDao.getCategoryById(1000);
        System.out.println(category);
    }

    @Test
    public void getCategorys() {
        List<Category> categorys = categoryDao.getCategorys();
        System.out.println(categorys);
    }
}