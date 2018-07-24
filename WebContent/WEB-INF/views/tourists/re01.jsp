<%@ page language="java" contentType="text/html; charset=utf8"
	pageEncoding="utf8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf8">
<title>Insert title here</title>
<style>
div{
	height: 75px;
	position: absolute;
	top: 30% ;
	 left:40%;
	width: 200px;
}
</style>
</head>
<body>
	<div>
		<h1>欢迎加入我们</h1>
		<a href="<%=request.getContextPath()%>/resume/02">java工程师</a> <br>
		<a href="<%=request.getContextPath()%>/resume/03">人事</a>
	</div>
</body>
</html>