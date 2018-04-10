package com.ssh.dao;

import java.util.List;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import com.ssh.entity.Emp;
@Repository("empDao")
public class EmpDaoImpl extends BaseDao implements EmpDao {

	@Override
	public void insertOrUpdateEmp(Emp emp) {
		this.getSession().saveOrUpdate(emp);
	}

	@Override
	public void deleteEmp(int empno) {
		String hql = "delete from Emp e where e.empno=:empno";
		this.getSession().createQuery(hql)
						.setInteger("empno", empno)
						.executeUpdate();
	}

	@Override
	public Emp queryEmpByid(int empno) {
		return (Emp) this.getSession().get(Emp.class, empno);
	}

	@Override
	public List<Emp> queryEmp(int start, int pageSize) {
		String hql = "from Emp e left join fetch e.dept order by e.empno";
		Query query = this.getSession().createQuery(hql);
		query.setFirstResult(start);
		query.setMaxResults(pageSize);
		return query.list();
	}

	@Override
	public int queryEmpCount() {
		String hql = "select count(*) from Emp";
		Query query = this.getSession().createQuery(hql);
		return ((Long) query.uniqueResult()).intValue();
	}

}
