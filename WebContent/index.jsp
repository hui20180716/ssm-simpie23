<%@ page language="java" contentType="text/html; charset=utf8"
	pageEncoding="utf8"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf8">
<title>Insert title here</title>
</head>
<body>

	<div style="color: red" align="center">
		<form action="tourist/register">
			<table>
				<tr>
					<td>注册</td>
				</tr>
				<tr>
					<td>用户名：</td>
					<td><input name="name" id="name"></td>
				</tr>
				<tr>
					<td>密码</td>
					<td><input name="password" id="password" /></td>
				</tr>
				<tr>
					<td><input type="submit" id="submit" /></td>
				</tr>
				<tr>
					<span></span>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>