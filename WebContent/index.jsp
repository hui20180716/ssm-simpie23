<%@ page language="java" contentType="text/html; charset=utf8"
	pageEncoding="utf8"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html >
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery.js"></script>
<script type="text/javascript">
  $(function(){
	  $("#submit1").click(function(){
	  var a = $("input[name='name']").val()
	  var b = $(":password").val()
	 $.ajax({
		 url:"tourist/register",
		 type:"post",
		 datqatype:"text",
		 data:{"name":a,"password":b},
		 success:function(data){
			if(data=="-1")
			 $("span").text("用户名已经被注册")
			else if(data=="1"){
				alert("注册成功");
			window.location.href="<%=request.getContextPath()%>/tourist/register2"
			}else
				alert("注册失败");
		 }
	 })
	  })
	   $("#submit2").click(function(){
	  var a = $("input[name='name']").val()
	  var b = $(":password").val()
	 $.ajax({
		 url:"tourist/loginTour",
		 type:"post",
		 datqatype:"text",
		 data:{"name":a,"password":b},
		 success:function(data){
		 if(data=="1"){
				alert("登录成功");
			window.location.href="<%=request.getContextPath()%>/tourist/register2"
			}else
				alert("登录失败");
		 }
	 })
	  })
  })
</script>
</head>

<body>
	<div style="color: red" align="center">
		<form action="javaScript:void(0)"><!-- tourist/register -->
			<table>
				<tr>
					<td>注册</td>
				</tr>
				<tr>
					<td>用户名：</td>
					<td><input name="name" id="name"  required="required"></td>
				</tr>
				<tr>
					<td>密码</td>
					<td><input  type="password" name="password" id="password"   required="required"/></td>
				</tr>
				 <tr>
					<td><span></span></td>
				</tr>
				<tr>
					<td><input type="submit" id="submit1"  value = "注册"/></td>
					 <td><input type="submit" id="submit2"  value = "登录"/></td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>