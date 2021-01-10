<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@include file="./common/tag.jsp" %>
<%@ taglib uri="http://www.springframework.org/tags/form"
	prefix="springForm"%>
<!DOCTYPE html>
<html>
<head>
	<%@include file="./common/bootstrap.jsp" %>
	<title>成功</title>
	<style>
		.error {
			color: #ff0000;
			font-style: italic;
			font-weight: bold;
		}
	</style>
</head>
<body>
	<springForm:form method="POST" modelAttribute="employee" action="save.do">
		<table>
			<tr>
				<td>Employee ID：</td>
				<td><springForm:input path="id" /></td>
				<td><springForm:errors path="id" cssClass="error" /></td>
			</tr>
			<tr>
				<td>Employee Name：</td>
				<td>
					<springForm:input path="name"/>
				</td>
				<td>
					<springForm:errors path="name" cssClass="error"/>
				</td>
			</tr>
			<tr>
				<td>Employee Role：</td>
				<td>
					<springForm:select path="role">
						<springForm:option value="ceo" label="CEO" />
						<springForm:option value="developer" label="Developer" />
						<springForm:option value="manager" label="Manager" />
					</springForm:select>
				</td>
				<td>
					<springForm:errors path="role" cssClass="error" />
				</td>
			</tr>
			<tr>
				<td colspan="3">
					<input type="submit" value="保存">
				</td>
			</tr>
		</table>
	</springForm:form>
</body>
</html>