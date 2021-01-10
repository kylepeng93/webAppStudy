<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@include file="./common/tag.jsp" %>
<!DOCTYPE html>
<html>
<head>
<%@include file="./common/bootstrap.jsp" %>
<title>系统错误</title>
</head>
<body>
  <h1>系统发生错误！</h1>
  <p>Application has encountered an error. Please contact support on ...</p>
  <!-- 
  	Failed URL : ${url}
  	Exception: ${exception.message}
  		<c:forEach items="${exception.stackTrace}" var="ste">
  			${ste} 
  		</c:forEach>
   -->
   <script>
   		console.log("<%=basePath%>");
   </script>
   <script type="text/javascript" src="assets/js/error.js"></script>
</body>
</html>