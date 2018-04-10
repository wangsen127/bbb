package com.ssh.dao;

import java.util.List;

import com.ssh.entity.Emp;

public interface EmpDao {

	public void insertOrUpdateEmp(Emp emp);
	public void deleteEmp(int empno);
	public Emp queryEmpByid(int empno);
	public List<Emp> queryEmp(int start,int pageSize);
	public int queryEmpCount();
}
