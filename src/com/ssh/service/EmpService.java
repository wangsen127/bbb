package com.ssh.service;

import java.util.List;

import com.ssh.entity.Emp;

public interface EmpService {

	public void insertEmp(Emp emp);
	public void updateEmp(Emp emp);
	public void deleteEmp(int empno);
	public Emp queryEmpByid(int empno);
	public List<Emp> queryEmp(int start,int pageSize);
	public int queryEmpCount();
}
