<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<fieldset style="width: 400px;height: 400px;">
			<legend>修改员工</legend>
			<form action="<%=request.getContextPath()%>/updateEmp.html" method="post">
				<input type="hidden" name="emp.empno" value="${emp.empno }">
				<p>
					<label>员工姓名</label>
					<input type="text" name="emp.ename" value="${emp.ename }"/>
				</p>
				<p>
					<label>职位</label>
					<input type="text" name="emp.job" value="${emp.job }"/>
				</p>
				<p>
					<label>管理者</label>
					<input type="text" name="emp.mgr" value="${emp.mgr }"/>
				</p>
				<p>
					<label>入职日期</label>
					<input type="text" name="emp.hiredate" value="<fmt:formatDate value='${emp.hiredate }' pattern='yyyy-MM-dd'/>"/>
				</p>
				<p>
					<label>工资</label>
					<input type="text" name="emp.sal" value="${emp.sal }"/>
				</p>
				<p>
					<label>奖金</label>
					<input type="text" name="emp.comm" value="${emp.comm }"/>
				</p>
				<p>
					<label>部门</label>
					<select name="emp.dept.deptno">
						<c:forEach items="${deptList }" var="d" >
						<option value="${d.deptno }" <c:if test="${d.deptno==emp.dept.deptno }">selected</c:if>>${d.dname }</option>
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