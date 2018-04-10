package com.ssh.action;

import java.util.List;

import javax.annotation.Resource;

import org.apache.struts2.ServletActionContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.ssh.entity.Dept;
import com.ssh.service.DeptService;

@Controller
@Scope("prototype")
public class DeptAction extends BaseAction{
	
	private static final long serialVersionUID = 1L;
	@Resource
	private DeptService deptService;
	private Dept dept;
	private int deptno;
	

	public String insertDept(){
		deptService.insertDept(dept);
		return SUCCESS;
	}
	
	public String updateDept(){
		deptService.updateDept(dept);
		return SUCCESS;
	}
	
	public String deleteDept(){
		deptService.deleteDept(deptno);
		return SUCCESS;
	}
	
	public String queryDept(){
		List<Dept> list = deptService.queryDetp();
		this.getRequest().put("list", list);
		return "query";
	}
	
	public String showInsertDept(){
		return "insert";
	}
	
	public String showUpdateDept(){
		Dept dept = deptService.queryDeptById(deptno);
		this.getRequest().put("dept", dept);
		return "update";
	}

	public void setDept(Dept dept) {
		this.dept = dept;
	}
	public Dept getDept() {
		return dept;
	}

	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	
	
	public String index(){
		return SUCCESS;
	}
}
