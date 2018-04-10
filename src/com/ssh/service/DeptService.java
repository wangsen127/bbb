package com.ssh.service;

import java.util.List;

import com.ssh.entity.Dept;

public interface DeptService {

	public void insertDept(Dept dept);
	public void updateDept(Dept dept);
	public void deleteDept(int deptno);
	public Dept queryDeptById(int deptno);
	public List<Dept> queryDetp();
}
