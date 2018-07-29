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
		var ints = self.setInterval(beats,2000)/* 每两秒执行程序setinterval */
		
		$("#b1").click(function(){
			ints=window.clearInterval(ints)
		})
		function beats(){
			
			$.ajax({
				url:"<%=request.getContextPath()%>/employees/setResume",
				type:"post",
				datatype:"json",
				success:function(data){/* [0,0] */
					
					if(data[1]!="0"){
					alert("有"+data[1]+"份新的简历投递");
					}
					if(data[3]!="0"){
						alert("有"+data[3]+"份新的面试");
						}
				}
			})
			
	}
	})
</script>
</head>
<body>

	<div>
	    <h1>严谨细致</h1>
		<a href = "<%=request.getContextPath()%>/employees/looksetResume">查看新简历</a> <br>
	    <a href = "<%=request.getContextPath()%>/enployee.jsp" ><input type = "button" value = "退出" id = "a4"/></a> <br>
	    <button id="b1"> stop</button>
	</div>        
</body>
</html>