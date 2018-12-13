package com.lxy.enums;

public enum CodeEnum {
	SUCCESS("1001","操作成功"),
	ERROR("2001","操作失败");
	
	private String code;
	private String message;
	private CodeEnum(String code, String message) {
		this.code = code;
		this.message = message;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
