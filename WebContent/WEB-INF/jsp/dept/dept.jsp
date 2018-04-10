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
		<a href="<%=request.getContextPath()%>/showInsertDept.html">添加部门</a>
		<table border="1" width="60%">
			<tr>
				<th>部门名称</th>
				<th>部门位置</th>
				<th>操作</th>
			</tr>
			<c:forEach items="${list }" var="d">
			<tr>
				<td>${d.dname }</td>
				<td>${d.loc }</td>
				<td>
					<a href="showUpdateDept.html?deptno=${d.deptno }">修改</a>
					&nbsp;&nbsp;
					<a href="deleteDept.html?deptno=${d.deptno }">删除</a>
				</td>
			</tr>	
			</c:forEach>
		</table>
	</div>
</body>
</html>