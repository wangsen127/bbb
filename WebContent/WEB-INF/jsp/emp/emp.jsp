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
		<a href="<%=request.getContextPath()%>/showInsertEmp.html">添加员工</a>
		<table border="1" width="60%">
			<tr>
				<th>员工姓名</th>
				<th>职位</th>
				<th>管理者</th>
				<th>入职日期</th>
				<th>工资</th>
				<th>奖金</th>
				<th>所在部门</th>
				<th>工作地点</th>
				<th>操作</th>
			</tr>
			<c:forEach items="${list }" var="e">
			<tr>
				<td>${e.ename }</td>
				<td>${e.job }</td>
				<td>${e.mgr }</td>
				<td>${e.hiredate }</td>
				<td>${e.sal }</td>
				<td>${e.comm }</td>
				<td>${e.dept.dname }</td>
				<td>${e.dept.loc }</td>
				<td>
					<a href="showUpdateEmp.html?empno=${e.empno }">修改</a>
					&nbsp;&nbsp;
					<a href="deleteEmp.html?empno=${e.empno }">删除</a>
				</td>
			</tr>	
			</c:forEach>
		</table>
		<a href="<%=request.getContextPath()%>/queryEmp.html">首页</a>
		<c:choose>
		<c:when test="${page==1 }">
		上一页
		</c:when>
		<c:otherwise>
		<a href="<%=request.getContextPath()%>/queryEmp.html?page=${page-1}">上一页</a>
		</c:otherwise>
		</c:choose>
		&nbsp;&nbsp;&nbsp;&nbsp;
		当前${page }页&nbsp;&nbsp;共${maxPage }页
		&nbsp;&nbsp;&nbsp;&nbsp;
		<c:choose>
		<c:when test="${page==maxPage }">
		下一页
		</c:when>
		<c:otherwise>
		<a href="<%=request.getContextPath()%>/queryEmp.html?page=${page+1}">下一页</a>
		</c:otherwise>
		</c:choose>
		<a href="<%=request.getContextPath()%>/queryEmp.html?page=${maxPage}">末页</a>
	</div>
</body>
</html>