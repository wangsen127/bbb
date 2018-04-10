package com.ssh.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ssh.dao.EmpDao;
import com.ssh.entity.Emp;
@Service("empService")
public class EmpServiceImpl implements EmpService {

	@Resource
	private EmpDao empDao;
	
	@Override
	public void insertEmp(Emp emp) {
		empDao.insertOrUpdateEmp(emp);
	}

	@Override
	public void updateEmp(Emp emp) {
		empDao.insertOrUpdateEmp(emp);
	}

	@Override
	public void deleteEmp(int empno) {
		empDao.deleteEmp(empno);
	}

	@Override
	public Emp queryEmpByid(int empno) {
		return empDao.queryEmpByid(empno);
	}

	@Override
	public List<Emp> queryEmp(int start, int pageSize) {
		return empDao.queryEmp(start, pageSize);
	}

	@Override
	public int queryEmpCount() {
		return empDao.queryEmpCount();
	}

}
