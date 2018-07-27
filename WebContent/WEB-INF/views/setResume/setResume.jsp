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
     <td>是否录用</td><td>查看简历</td></tr>
     <c:forEach items="${requestScope.newResume}"  var="Resume">
        <tr>
             <td>${Resume.srId}</td>  <td>${Resume.tourist.tname}</td> <td><fmt:formatDate value="${Resume.srTime}" pattern="yyyy-MM-dd "/> </td>
             <td>${Resume.state}</td><td>${Resume.interView}</td><td>${Resume.employment}</td>
             <td><a href="<%=request.getContextPath()%>/resume/showResume?id=${Resume.tourist.resume.rid}&srid=${Resume.srId}">查看简历</a></td>
        </tr> 
     </c:forEach>
     
     </table> 
</body>
</html>