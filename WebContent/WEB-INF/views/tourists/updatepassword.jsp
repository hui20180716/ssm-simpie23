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
	  var reg=/^[a-zA-Z][\w]{6,30}$/;
	  $("#submit1").click(function(){
		  var a = $("#password").val()
		  var b = $("#newPassword").val()
		   var c = $("#newPassword2").val()
		  alert(a)
		  alert(b)
		  alert(c)
	   if(!reg.test(b)){
		  alert("错误：密码为字母、数字、符号且大于6并且第一个字母为字母");
	   }else if(b!=c) {
		   alert("错误：密码两次输入不一致")
		  }else{
	 $.ajax({
		 url:"<%=request.getContextPath()%>/tourist/updatepassword2",
		 type:"post",
		 datqatype:"text",
		 data:{"password":a,"newPassword":b},
		 success:function(data){
			 alert(data)
			if(data=="true"){
				alert(data);
				alert("修改成功");
				
				 window.location.href="<%=request.getContextPath()%>/tourist/register2";
			}else {
				alert("修改失败");
			}
	     }
	
	 })
	 
	 }
	  })
		  })
</script>
</head>
<body>
	<div style="color: red" align="center">
		<form action="javaScript:void(0)">
			<!-- tourist/register -->
			<table>
				<tr>
					<td>修改密码：</td>
				</tr>
				<tr>
					<td>原密码：</td>
					<td><input type="password" name="password" id="password"
						required="required"></td>
				</tr>
				<tr>
					<td>新密码：</td>
					<td><input type="password" name="newPassword" id="newPassword"
						required="required" /></td>
				</tr>
				<tr>
					<td>再次输入密码：</td>
					<td><input type="password" name="newPassword2"
						id="newPassword2" required="required" /></td>
				</tr>
				<tr>
					<td><span></span></td>
				</tr>
				<tr>
					<td><input type="submit" id="submit1" value="提交" /></td>
				</tr>
			</table>
		</form>
	</div>

</body>
</html>