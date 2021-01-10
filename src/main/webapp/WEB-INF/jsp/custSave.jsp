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
	<springForm:form method="POST" modelAttribute="customer" action="save.do">
		<table>
			<tr>
				<td>Name:</td>
				<td><springForm:input path="name" /></td>
				<td><springForm:errors path="name" cssClass="error" /></td>
			</tr>
			<tr>
				<td>Email: </td>
				<td><springForm:input path="email" /></td>
				<td><springForm:errors path="email" cssClass="error" />
			</tr>
			<tr>
				<td>Age: </td>
				<td><springForm:input path="age" />
				<td><springForm:errors path="age" cssClass="error" /></td>
			</tr>
			<tr>
				<td>Gender</td>
				<td>
					<springForm:select path="gender">
						<springForm:option value="" label="选择你的性别"/>
						<springForm:option value="MALE" label="男" />
						<springForm:option value="FEMALE" label="女" />
					</springForm:select>
				</td>
				<td><springForm:errors path="gender" cssClass="error" />
			</tr>
			<tr>
				<td>
					Birthday:
				</td>
				<td><springForm:input path="birthday" placeholder="yyyy-MM-dd" /></td>
				<td><springForm:errors path="birthday" cssClass="error" /></td>
			</tr>
			<tr>
				<td>Phone: </td>
				<td><springForm:input path="phone"/> </td>
				<td><springForm:errors path="phone" cssClass="error"/></td>
			</tr>
			<tr>
				<td colspan="3"><input type="submit" value="保存"></td>
			</tr>
		</table>
	</springForm:form>
</body>
</html>