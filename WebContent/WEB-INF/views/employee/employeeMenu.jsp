<%@ page language="java" contentType="text/html; charset=utf8"
    pageEncoding="utf8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery.js"></script>
<script type="text/javascript">
  $(function(){
	   $("#b1").click(function(){
	  alert(a)
	 $.ajax({
		 url:"employee2/workShift",
		 type:"post",
		 datqatype:"text",
		 data:,
		 success:function(data){
		 if(data=="true"){
				alert("登录成功");
			$("form").attr("action","<%=request.getContextPath()%>/employees/menu") 
			$("form").submit();
			<%-- window.location.href="<%=request.getContextPath()%>/tourist/register2"   employees/menu--%>
			}else
				alert("登录失败");
		 }
	 })
	  })
  })
</script>
</head>
<body >
    success
    <button id = "b1" >上班打卡</button><br>
    <button id = "b2" >下班打卡</button><br>
    <a href="<%=request.getContextPath()%>/employee2/insert">查看薪资表</a><br>
    <a href="${pageContext.request.contextPath}/employee2/train">培训</a><br>
    <a href="">查看奖惩表</a><br>
    <a href="">查看考勤表</a><br>
</body>
</html>