<%@ page language="java" contentType="text/html; charset=utf8"
    pageEncoding="utf8" import="com.iotek.ssm.entity.SetResume,com.iotek.ssm.entity.Tourist"%>
<!DOCTYPE >
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf8">
<title>Insert title here</title>
</head>
<body>
     <table>
     <tr><td>序号</td><td>应聘者</td><td>投递时间</td><td>查看状态</td><td>面试状态</td>
     <td>是否录用</td><td></td></tr>
        <tr>
             <td>${requestScope.newResume.srId}</td>  <td>${requestScope.newResume.tourist.tname}</td> <td><fmt:formatDate value="${requestScope.newResume.srTime}" pattern="yyyy-MM-dd "/> </td>
             <td>${requestScope.newResume.state}</td><td>${requestScope.newResume.interView}</td><td>${requestScope.newResume.employment}</td>
              
              <c:if test="${requestScope.newResume.interView==1}">
	             <td><a href="<%=request.getContextPath()%>/tourist/findsetResume3?bolean=true"><input type="button" value = "接受面试"/></a></td>
	             <td><a href="<%=request.getContextPath()%>/tourist/findsetResume3?bolean=false"><input type="button" value = "不接受面试 "/></a></td>
             </c:if>
        </tr> 
     </table> 
</body>
</html>
