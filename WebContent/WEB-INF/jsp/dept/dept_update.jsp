<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<fieldset style="width: 400px;height: 250px;">
			<legend>修改部门</legend>
			<form action="<%=request.getContextPath()%>/updateDept.html" method="post">
				<input type="hidden" name="dept.deptno" value="${dept.deptno }"/>
				<p>
					<label>部门名称</label>
					<input name="dept.dname" value="${dept.dname }"/>
				</p>
				<p>
					<label>部门位置</label>
					<input name="dept.loc" value="${dept.loc }"/>
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