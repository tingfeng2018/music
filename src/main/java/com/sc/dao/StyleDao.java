package com.sc.dao;

import com.sc.entity.Style;
import org.springframework.stereotype.Repository;

/**
 * @Auther: hushuang
 * @Date: 2018/7/19 14:57
 * @Description:
 */
@Repository
public interface StyleDao {

    Style getStyleById(Integer id);

}
