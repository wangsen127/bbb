package com.ssh.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ssh.dao.DeptDao;
import com.ssh.entity.Dept;

@Service("deptService")
public class DeptServiceImpl implements DeptService {

	@Resource
	private DeptDao deptDao;
	
	@Override
	public void insertDept(Dept dept) {
		deptDao.insertOrUpdateDept(dept);
	}

	@Override
	public void updateDept(Dept dept) {
		deptDao.insertOrUpdateDept(dept);
	}

	@Override
	public void deleteDept(int deptno) {
		deptDao.deleteDept(deptno);
	}

	@Override
	public Dept queryDeptById(int deptno) {
		return deptDao.queryDeptById(deptno);
	}

	@Override
	public List<Dept> queryDetp() {
		return deptDao.queryDetp();
	}

}
