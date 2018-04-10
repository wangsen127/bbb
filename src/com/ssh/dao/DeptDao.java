package com.ssh.dao;

import java.util.List;

import com.ssh.entity.Dept;

public interface DeptDao {

	public void insertOrUpdateDept(Dept dept);
	public void deleteDept(int deptno);
	public Dept queryDeptById(int deptno);
	public List<Dept> queryDetp();
}
