package com.ssh.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import com.ssh.entity.Dept;
@Repository("deptDao")
public class DeptDaoImpl extends BaseDao implements DeptDao {

	@Override
	public void insertOrUpdateDept(Dept dept) {
		this.getSession().saveOrUpdate(dept);
	}

	@Override
	public void deleteDept(int deptno) {
		this.getSession().createQuery("delete from Dept d where d.deptno=:deptno")
						.setInteger("deptno", deptno)
						.executeUpdate();
	}

	@Override
	public Dept queryDeptById(int deptno) {
		return (Dept) this.getSession().get(Dept.class, deptno);
	}

	@Override
	public List<Dept> queryDetp() {
		return this.getSession().createQuery("from Dept d order by d.deptno").list();
	}

}
