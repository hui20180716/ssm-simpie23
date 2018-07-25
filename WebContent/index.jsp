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
	  var reg=/^[a-zA-Z][\w]{6,30}$/;
	  $("#submit1").click(function(){
	  var a = $("input[name='name']").val()
	  var b = $(":password").val()
	  
	  if(!reg.test(a)){
		  alert("错误：用户名长度不能少于6个字符并且第一个字母为字母"); 
	  }else if(!reg.test(b)){
		  alert("错误：密码为字母、数字、符号且大于6并且第一个字母为字母");
		  }else{
	 $.ajax({
		 url:"tourist/register",
		 type:"post",
		 datqatype:"text",
		 data:{"name":a,"password":b},
		 success:function(data){
			 
			if(data=="-1"){
				
			 $("span").text("用户名已经被注册")
			}else if(data=="0"){
				alert("注册失败");
			}else{
				alert("注册成功");
				$("form").attr("action","<%=request.getContextPath()%>/tourist/register2") 
				$("form").submit();
			<%-- window.location.href="<%=request.getContextPath()%>/tourist/register2?id="+data --%>
			
		 }
	 }})}
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
			$("form").attr("action","<%=request.getContextPath()%>/tourist/register2") 
			$("form").submit();
			<%-- window.location.href="<%=request.getContextPath()%>/tourist/register2" --%>
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