package com.lxy.dao;

import com.lxy.model.Menu;

public interface MenuDao {
    int deleteByPrimaryKey(String id);

    int insert(Menu record);

    int insertSelective(Menu record);

    Menu selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Menu record);

    int updateByPrimaryKey(Menu record);
}