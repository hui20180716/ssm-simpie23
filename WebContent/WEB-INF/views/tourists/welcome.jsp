<%@ page language="java" contentType="text/html; charset=utf8"
	pageEncoding="utf8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery.js"></script>
<script type="text/javascript">
	$(function() {
		var a = $("#input").val()
		if(a=="true")
			alert("你没有简历，请填写简历");
	})
</script>
</head>
<body>
  <input id = "input" type= "hidden" value = "${requestScope.flage}">
	<div>
	    <h1>欢迎访问</h1>
		<a href="<%=request.getContextPath()%>/tourist/recruit">浏览招聘职位信息</a> 
		<a href = "<%=request.getContextPath()%>/resume/04">创建简历</a> 
		<a href = "<%=request.getContextPath()%>/resume/updateResume">查看/修改简历</a> 
		<a href = "">修改登录密码</a> 
	</div>
</body>
</html>