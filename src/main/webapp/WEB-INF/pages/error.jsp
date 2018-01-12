<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String path = request.getContextPath();
		request.setAttribute("path", path);
	%>
	<center>
		<font color="red">
			<h2>您输入的信息有误，请重新输入</h2>
		</font>
		<font size="5">
			<a href="${requestScope.path }/WEB-INF/pages/detail.jsp">进入</a>
		</font>
	</center>
</body>
</html>