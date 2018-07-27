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
		if(a=="false")
			alert("你没有简历，请填写简历");
		if(a=="ok")
			alert("简历投递成功");
		if(a=="no")
			alert("简历投递失败");
		if(a=="no2")
			alert("你的简历还没有投递");
		if(a=="f2")
			alert("你被邀请面试了，不用再投递了");
		 $("#a4").click(function(){
			 var b = false;
			 b=window.confirm("是否要退出？");
				 return b;
		 })
			var ints = self.setInterval(beats,2000)/* 每两秒执行程序setinterval */
			
			$("#b1").click(function(){
				ints=window.clearInterval(ints)
			})
			function beats(){
				
				$.ajax({
					url:"<%=request.getContextPath()%>/tourist/findsetResume",
					type:"post",
					datatype:"post",
					
					success:function(data){
						
						if(data=="1")
						alert("邀请你面试");
					}
				})
		}
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
		<a href = "<%=request.getContextPath()%>/tourist/setResume">投递简历</a> <br>
		<a href = "<%=request.getContextPath()%>/tourist/findsetResume2">查看投递简历进度</a> <br>
	    <a href = "<%=request.getContextPath()%>/index.jsp" ><input type = "button" value = "退出" id = "a4"/></a> <br>
	</div> 
	 <button id="b1"> stop</button>                                          
</body>
</html>