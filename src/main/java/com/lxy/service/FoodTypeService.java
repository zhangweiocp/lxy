package com.lxy.service;

import java.util.List;

import com.lxy.model.FoodTypeDO;

/**
 * 食品种类
 * @author zhangwei
 *
 */
public interface FoodTypeService {
	/**
	 * 获取食品种类
	 * @return
	 */
	List<FoodTypeDO> getFoodType();
}
