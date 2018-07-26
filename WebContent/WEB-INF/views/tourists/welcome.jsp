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
		 $("#a4").click(function(){
			 
			 var b = false;
			 b=window.confirm("是否要退出？");
				 return b;
		 })
	})
</script>
</head>
<body>
  <input id = "input" type= "hidden" value = "${requestScope.flage}">
	<div>
	    <h1>欢迎您访问</h1>
		<a href="  <%=request.getContextPath()%>/tourist/recruit">浏览招聘职位信息</a> <br>
		<a href = "<%=request.getContextPath()%>/resume/04">创建简历</a> <br>
		<a href = "<%=request.getContextPath()%>/resume/updateResume">查看/修改简历</a><br> 
		<a href = "<%=request.getContextPath()%>/tourist/updatePassword">修改登录密码</a> <br>
	    <a href = "<%=request.getContextPath()%>/index.jsp" ><input type = "button" value = "退出" id = "a4"/></a> <br>
	</div>                                           
</body>
</html>