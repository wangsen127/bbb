package com.ssh.entity;
/**
 * 普通的实体类
 */
public class Dept {

	/**
	 * 对象唯一标识符属性
	 */
	private Integer deptno;
	/**
	 * 普通属性
	 */
	private String dname;
	private String loc;
	public Integer getDeptno() {
		return deptno;
	}
	public void setDeptno(Integer deptno) {
		this.deptno = deptno;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
}
