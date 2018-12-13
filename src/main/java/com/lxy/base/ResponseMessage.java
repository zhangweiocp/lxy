package com.lxy.base;

/**
 * 响应信息
 * @author zhangwei
 *
 */
public class ResponseMessage {
	private String code;
	private String message;
	private Object data;
	private Exception e;
	private String exceptionMessage;
	public ResponseMessage(String code,String message){
		this(code, message, null);
	}

	public ResponseMessage(String code,String message,Object data){
		this(code, message, data, null, null);
	}
	
	public ResponseMessage(String code, String message, Object data, Exception e, String exceptionMessage) {
		this.code = code;
		this.message = message;
		this.data = data;
		this.e = e;
		this.exceptionMessage = exceptionMessage;
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
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	public Exception getE() {
		return e;
	}
	public void setE(Exception e) {
		this.e = e;
	}
	public String getExceptionMessage() {
		return exceptionMessage;
	}
	public void setExceptionMessage(String exceptionMessage) {
		this.exceptionMessage = exceptionMessage;
	}
	
}
