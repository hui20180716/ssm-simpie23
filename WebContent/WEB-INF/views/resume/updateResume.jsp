<%@ page language="java" contentType="text/html; charset=utf8"
	pageEncoding="utf8" import="com.iotek.ssm.entity.Resume"%>
<!DOCTYPE >
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery.js"></script>
<script type="text/javascript">
	$(function() {
	    $("#position option").hide()
		$("#dept").change(function(){
		var a = $(this).val();
		$("#position option").hide()
		$("."+a).show()
		$("#position").val("")
		})
	})
</script>
</head>
<body>
	<form action="<%=request.getContextPath()%>/resume/resume"
		method="get">
		<input name="rid" value="-1" type = "hidden">
		<table>
		
			<tr>
				<td>简历</td>
				<td></td>
				<td></td>
				<td></td>
			</tr>
			<tr>
				<td>真实姓名</td>
				<td><input name="name" type="text" value = ${requestScope.resume.name }></td>
				<td>性别</td>
				<c:if>
				<td><input type="radio" name="sex" value="男"  checked="true"/><label>男</label>
					<input type="radio" name="sex" value="女" /><label>女</label></td>
			</tr>
			<tr>
				<td>年龄</td>
				<td><input name="age" type="number" value = ${requestScope.resume.age } ></td>
				<td>学历</td>
				<td><select name="educal">
				<option value=" ${requestScope.resume.educal }"> ${requestScope.resume.educal }</option>
						<option value="学历">学历</option>
						<option value="博士">博士</option>
						<option value="硕士">硕士</option>
						<option value="本科">本科</option>
						<option value="大专">大专</option>
				</select></td>
			</tr>
			<tr>
				<td>联系方式</td>
				<td><input type="number" name="tel"  value = ${requestScope.resume.tel }></td>
				<td>e-mail</td>
				<td><input type="email" name="email" value = ${requestScope.resume.email }></td>
			</tr>
			<tr>
				<td>应聘职位</td>
				<td><select id="dept" name="dept.did">
				     <option value="0">${requestScope.resume.dept.dName}</option>
						<option value="0">--请选择部门--</option>
						<c:forEach items="${sessionScope.depts}" var="dept" >
		 		          <option value="${dept.dId}">${dept.dName}</option>
    		            </c:forEach>
    				</select> <select id="position" name="posi.pid">
				        <option value="0">${requestScope.resume.posi.pName}</option>
				        <option value="0">--请选择职位--</option>
						<c:forEach items="${sessionScope.depts}" var="dept" >
			               <c:forEach items="${dept.positionss}" var="posi" >
		    	             <option class="${dept.dId}"  value = "${posi.pId}">${posi.pName}</option>
			               </c:forEach> 
		                </c:forEach> 
				</select></td>
				<td>政治面貌</td>
				<td><select name="positics">
				        <option value="${requestScope.resume.poitics}">${requestScope.resume.poitics}</option>
						<option value="普通群众">普通群众</option>
						<option value="团员">团员</option>
						<option value="党员">党员</option>
						<option value="其他">其他</option>
				</select></td>
			</tr>
			<tr>
				<td>工作经验</td>
				<td><input name="expe" type="text" value = "${requestScope.resume.expe}"></td>
				<td>上份工作</td>
				<td><input name="lastjob" type="text" value = "${requestScope.resume.lastjob}" ></td>
			</tr>
			<tr>
				<td>期望薪资</td>
				<td><select name="salary">
				        <option value="${requestScope.resume.lastjob}">${requestScope.resume.lastjob}</option>
						<option value="1">3000-5000</option>
						<option value="2">5000-70000</option>
						<option value="3">7000-10000</option>
						<option value="4">7000-10000</option>
						<option value="5">10000以上</option>
				</select></td>
				<td>兴趣爱好</td>
				<td><input name="hobby" type="text" value = "${requestScope.resume.hobby}"></td>
			</tr>
			<tr>
				<td><input type="submit" value="保存"></td>
				<td></td>
				<td><input value="返回" type="button"></td>
				<td></td>
			</tr>
		</table>
	</form>
</body>
</html>