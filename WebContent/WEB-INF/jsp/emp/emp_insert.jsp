<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<fieldset style="width: 400px;height: 400px;">
			<legend>新增员工</legend>
			<form action="<%=request.getContextPath()%>/insertEmp.html" method="post">
				<p>
					<label>员工姓名</label>
					<input type="text" name="emp.ename"/>
				</p>
				<p>
					<label>职位</label>
					<input type="text" name="emp.job"/>
				</p>
				<p>
					<label>管理者</label>
					<input type="text" name="emp.mgr"/>
				</p>
				<p>
					<label>入职日期</label>
					<input type="text" name="emp.hiredate"/>
				</p>
				<p>
					<label>工资</label>
					<input type="text" name="emp.sal"/>
				</p>
				<p>
					<label>奖金</label>
					<input type="text" name="emp.comm"/>
				</p>
				<p>
					<label>部门</label>
					<select name="emp.dept.deptno">
						<c:forEach items="${deptList }" var="d" >
						<option value="${d.deptno }">${d.dname }</option>
						</c:forEach>
					</select>
				</p>
				<p>
					<button type="submit">确定</button>
					<button type="reset">取消</button>
				</p>
			</form>
		</fieldset>
	</div>
</body>
</html>