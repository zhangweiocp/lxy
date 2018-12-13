package com.lxy.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lxy.base.ResponseMessage;
import com.lxy.enums.CodeEnum;
import com.lxy.model.FoodTypeDO;
import com.lxy.service.FoodTypeService;

/**
 * 食品类型管理
 * @author zhangwei
 *
 */

@Controller
@RequestMapping("/foodType")
public class FoodTypeController {
	
	@Autowired
	private FoodTypeService foodTypeService;
	
	@RequestMapping(value="toFoodType",method=RequestMethod.GET)
	public String toFoodType(HttpServletRequest request,Model model) {
		return "foodType";
	}
	
	/**
	 * 获取食物类型
	 * @param request
	 * @param model
	 * @return
	 */
	@RequestMapping(value="getFoodType",method=RequestMethod.GET)
	@ResponseBody
	public ResponseMessage getFoodType(HttpServletRequest request,HttpServletResponse response,Model model) {
		Map<String,Object> resultMap = new HashMap<>();
		List<FoodTypeDO> list = foodTypeService.getFoodType();
		String address = request.getLocalAddr()+":"+request.getLocalPort();
		resultMap.put("list", list);
		resultMap.put("address", address);
		//model.addAttribute("foodTypeList", list);
		return new ResponseMessage(CodeEnum.SUCCESS.getCode(),CodeEnum.SUCCESS.getMessage(),resultMap);
	}
}
