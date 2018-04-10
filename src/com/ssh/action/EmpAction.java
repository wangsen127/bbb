package com.ssh.action;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.ssh.entity.Dept;
import com.ssh.entity.Emp;
import com.ssh.service.DeptService;
import com.ssh.service.EmpService;
@Controller
@Scope("prototype")
public class EmpAction extends BaseAction{

	private static final long serialVersionUID = 1L;
	
	@Resource
	private EmpService empService;
	@Resource
	private DeptService deptService;
	private Emp emp;
	private int empno;
	public String insertEmp(){
		empService.insertEmp(emp);
		return SUCCESS;
	}
	public String updateEmp(){
		empService.updateEmp(emp);
		return SUCCESS;
	}
	public String deleteEmp(){
		empService.deleteEmp(empno);
		return SUCCESS;
	}
	public String showInsertEmp(){
		List<Dept> list = deptService.queryDetp();
		this.getRequest().put("deptList", list);
		return "insert";
	}
	public String showUpdateEmp(){
		List<Dept> list = deptService.queryDetp();
		this.getRequest().put("deptList", list);
		Emp emp = empService.queryEmpByid(empno);
		this.getRequest().put("emp", emp);
		return "update";
	}
	public String queryEmp(){
		//当前页面数
		if(this.getPage()==0){
			this.setPage(1);
		}
		//总记录数
		this.setMaxCount(empService.queryEmpCount());
		//总页数
		this.setMaxPage();
		
		List<Emp> list = empService.queryEmp((this.getPage()-1)*this.getPageSize(), this.getPageSize());
		this.getRequest().put("list", list);
		return "query";
	}
	
	public Emp getEmp() {
		return emp;
	}
	public void setEmp(Emp emp) {
		this.emp = emp;
	}
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
}
