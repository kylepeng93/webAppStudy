<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@include file="./common/tag.jsp" %>
<%@ taglib uri="http://www.springframework.org/tags/form"
	prefix="springForm"%>
<!DOCTYPE html>
<html>
<head>
	<%@include file="./common/bootstrap.jsp" %>
	<title>成功</title>
</head>
<body>
	<strong>员工id为：${emp.id} </strong>
	<strong>员工姓名为：${emp.name }</strong>
	<strong>员工角色为：${emp.role}</strong>
</body>
</html>