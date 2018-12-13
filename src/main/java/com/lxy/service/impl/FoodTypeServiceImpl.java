package com.lxy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lxy.dao.FoodTypeDao;
import com.lxy.model.FoodTypeDO;
import com.lxy.service.FoodTypeService;

/**
 * 食品管理
 * @author zhangwei
 *
 */
@Service
public class FoodTypeServiceImpl implements FoodTypeService{

	@Autowired
	private FoodTypeDao foodTypeDao;
	
	@Override
	public List<FoodTypeDO> getFoodType() {
		return foodTypeDao.getFoodType();
	}
	
}
