package com.ssh.action;

import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;

import com.opensymphony.xwork2.ActionSupport;

public class BaseAction extends ActionSupport implements RequestAware{

	private static final long serialVersionUID = 1L;
	private Map<String, Object> request;
	@Override
	public void setRequest(Map<String, Object> request) {
		this.request = request;
	}
	public Map<String, Object> getRequest() {
		return request;
	}
	
	/**
	 * 接收当前页面数的属性
	 */
	private int page;
	private int pageSize = 5;
	private int maxCount;
	private int maxPage;
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getMaxCount() {
		return maxCount;
	}
	public void setMaxCount(int maxCount) {
		this.maxCount = maxCount;
	}
	public int getMaxPage() {
		return maxPage;
	}
	public void setMaxPage() {
		this.maxPage = maxCount%pageSize==0?maxCount/pageSize:maxCount/pageSize+1;
	}
}
