package com.lxy.model;

/**
 * 食品种类
 * @author zhangwei
 *
 */

public class FoodTypeDO {
	private String id;
	private String typeName;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTypeName() {
		return typeName;
	}
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	@Override
	public String toString() {
		return "FoodTypeDO [id=" + id + ", typeName=" + typeName + "]";
	}
	
}
