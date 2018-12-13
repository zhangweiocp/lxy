package com.lxy.base;
/**
 * 分页查询条件
 * @author zhangwei
 *
 */
public class PageQuery {
	private int pageSize = 10;
	private int pageNum = 1;
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getPageNum() {
		return pageNum;
	}
	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}
	
}
