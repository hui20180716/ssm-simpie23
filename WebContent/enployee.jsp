<%@ page language="java" contentType="text/html; charset=utf8"
	pageEncoding="utf8"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html >
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf8">
<title>Insert title here</title>
<style type="text/css">

</style>

<link rel="stylesheet" href="${pageContext.request.contextPath}/css/bg.css">

<script src="https://code.jquery.com/jquery.js"></script>
<script type="text/javascript">
  $(function(){
	   $("#submit2").click(function(){
	  var a = $("input[name='name']").val()
	  alert(a)
	  var b = $(":password").val()
	 $.ajax({
		 url:"employees/loginTour",
		 type:"post",
		 datatype:"text",
		 data:{"id":a,"password":b},
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
<div id ="bg"></div>
	<div style="color: red" align="center"  >
		<form action="javaScript:void(0)"><!-- tourist/register -->
			<table>
				<tr>
					<td>注册</td>
				</tr>
				<tr>
					<td>工号：</td>
					<td><input name="name" id="name"   required="required" maxlength="11"></td>
				</tr>
				<tr>
					<td>密码</td>
					<td><input  type="password" name="password" id="password"   required="required"/></td>
				</tr>
				 <tr>
					<td><span></span></td>
				</tr>
				<tr>
					 <td><input type="submit" id="submit2"  value = "登录"/></td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>