<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@include file="./common/tag.jsp" %>
<%@ taglib uri="http://www.springframework.org/tags/form"
	prefix="springForm"%>
<!DOCTYPE html>
<html>
<head>
	<%@include file="./common/bootstrap.jsp" %>
	<title>客户信息保存成功</title>
</head>
<body>

<strong>
	Customer Name: ${customer.name}
</strong>
<strong>
	Customer Email:${customer.email }	
</strong>
<strong>
	Customer Age:${customer.age }
</strong>
<strong>
	Customer birthday:<fmt:formatDate value="${customer.birthday }" type="date" />
</strong>
</body>
</html>