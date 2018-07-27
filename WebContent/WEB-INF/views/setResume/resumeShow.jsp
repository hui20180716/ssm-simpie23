<%@ page language="java" contentType="text/html; charset=utf8"
	pageEncoding="utf8" import="com.iotek.ssm.entity.Resume"%>
<!DOCTYPE >
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery.js"></script>
<script type="text/javascript">  
	$(function() {
		$(":submit").click(function(){
       var date= $("#date").val();
       if(date==""){
    	   alert("你还没有选择面试时间");
    	   return false;
       }
	})
	})
</script>
</head>
<body>
	<form action="<%=request.getContextPath()%>/employees/Invitation"
		method="get">
		<table>
			<tr>
				<td>简历</td>
				<td></td>
				<td><input name="rtid" value="${requestScope.setResume.srId }"
					type="hidden" /></td>
				<td></td>
			</tr>
			<tr>
				<td>真实姓名</td>
				<td><input name="name" type="text"
					value=${requestScope.resume.name } required="required"
					readonly="true"></td>
				<td>性别</td>
				<td><input value="${requestScope.resume.sex}" readonly="true">
				</td>
			</tr>
			<tr>
				<td>年龄</td>
				<td><input name="age" type="number"
					value=${requestScope.resume.age } readonly="true"
					required="required"></td>
				<td>学历</td>
				<td><input value="${requestScope.resume.educal }"
					readonly="true"></td>
			</tr>
			<tr>
				<td>联系方式</td>
				<td><input type="number" name="tel"
					value=${requestScope.resume.tel } readonly="true"
					required="required"></td>
				<td>e-mail</td>
				<td><input type="email" name="email"
					value=${requestScope.resume.email } readonly="true"
					required="required"></td>
			</tr>
			<tr>
				<td>应聘职位</td>
				<td><input value="${requestScope.resume.posi.pName}"
					readonly="true"></td>
				<td>政治面貌</td>
				<td><input value="${requestScope.resume.poitics}"
					readonly="true" readonly="true" /></td>
			</tr>
			<tr>
				<td>工作经验</td>
				<td><input name="expe" type="text"
					value="${requestScope.resume.expe}" required="required"
					readonly="true"></td>
				<td>上份工作</td>
				<td><input name="lastjob" type="text"
					value="${requestScope.resume.lastjob}" required="required"
					readonly="true"></td>
			</tr>
			<tr>
				<td>期望薪资</td>
				<td><input value="${requestScope.resume.salary}"></td>
				<td>兴趣爱好</td>
				<td><input name="hobby" type="text"
					value="${requestScope.resume.hobby}" required="required"
					readonly="true"></td>
			</tr>

			<tr>
				<td><input type="submit" id = "submit" value="邀请面试"></td>
				<td><input type="date" id="date" name = "date"></td>
				<td><a href="<%=request.getContextPath()%>/employees/menu"><input value="返回" type="button"></a></td>
				<td></td>
			</tr>
		</table>
	</form>
</body>
</html>