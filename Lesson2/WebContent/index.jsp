<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>首页</title>
</head>
<body>

	<%
		String displayStr = "";
		boolean isLogin = false;
		Object userName = session.getAttribute("userName");
		if (userName != null) {
			displayStr = userName.toString() + ",欢迎你！";
			isLogin = true;
		}
	%>

	<h1>我是个简单的首页</h1>
	<h2><%=displayStr%></h2>

	<%
		if (!isLogin) {
	%>
	<p>
		<a href="login.jsp">登录</a>
	</p>
	<%
		} else {
	%>
	<p>
		<a href="logoutAction.jsp">退出</a>
	</p>
	<%
		}
	%>

</body>
</html>