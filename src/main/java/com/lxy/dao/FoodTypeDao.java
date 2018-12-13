package com.lxy.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.lxy.model.FoodTypeDO;

@Repository
public interface FoodTypeDao {
	List<FoodTypeDO> getFoodType();
}
