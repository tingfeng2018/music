package com.sc.dao;

import com.sc.entity.Category;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Auther: hushuang
 * @Date: 2018/7/19 14:20
 * @Description:
 */
@Repository
public interface CategoryDao {

    /**
     * 添加类目
     * @param category
     */
    void addCategory(Category category);

    /**
     * 更新类目
     * @param category
     */
    void updateCategory(Category category);

    /**
     * 根据ID删除音乐
     * @param id
     */
    void deleteCategoryById(Integer id);

    /**
     * 根据音乐ID查询音乐详情
     * @param id
     * @return
     */
    Category getCategoryById(Integer id);

    /**
     * 获取音乐列表
     * @return
     */
    List<Category> getCategorys();

}
