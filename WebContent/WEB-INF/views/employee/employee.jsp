<%@ page language="java" contentType="text/html; charset=utf8"
    pageEncoding="utf8" import="com.iotek.ssm.entity.Employees,com.iotek.ssm.entity.Resume,com.iotek.ssm.entity.Dept,
	com.iotek.ssm.entity.Position"%>
<!DOCTYPE >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf8">
<title>Insert title here</title>
</head>
<body>
     <form action="<%=request.getContextPath()%>/employee2/insert">
        <table>
          <tr>
             <td>个人信息</td><td></td><td> <input  name="resume.rid" type="hidden" value="${requestScope.resume.rid}"> </td><td></td>
          </tr>
          <tr>
            <td>真实姓名</td><td><input name  = "name" required="required"></td>
            <td>性别</td>
            <td><input type="radio" name="sex" value="男"  checked="true"/><label>男</label>
				<input type="radio" name="sex" value="女" /><label>女</label>
			</td>
           </tr>
          <tr>
             <td>年龄</td><td><input name="age" required="required"></td>
             <td>学历</td><td><input name="educal" required="required"></td>
           </tr>
          <tr>
            <td>联系方式</td><td><input name = "tel"  required="required"></td>
            <td>Email</td><td><input type="email" name="email" required="required"></td>
           </tr>
           <tr>
	            <td>部门</td><td ><input name = "dept.dName" value="${requestScope.resume.dept.dName}"  readonly="true"></td>
	            <td>职位</td><td><input name = "posi.pName" value="${requestScope.resume.posi.pName}"  readonly="true"> </td>
           </tr>
           <tr>
	            <td>银行卡号</td><td><input name="cardId" required="required"></td>
	          <td>入职时间</td><td><input name = "cTime"  type = "date" required="required"></td>
           </tr>
           <tr>
	            <td><input type="submit" value = "保存" ></td><td></td>
	            <td><a href="null"> <input value="返回" type="button"></a></td><td></td>
           </tr>
        </table>
     </form>
   
</body>
</html>