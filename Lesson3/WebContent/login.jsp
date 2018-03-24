
<%@ page language="java" contentType="text/html; charset=UTF-8"
	import="java.util.Date,java.text.SimpleDateFormat;"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>用户登录</title>
<link rel="stylesheet" href="assets/css/amazeui.css" />
<link rel="stylesheet" href="assets/css/other.min.css" />
<style type="text/css">
.error {
	color: red;
	margin:0;
	padding:0;
}
</style>
</head>
<body class="login-container">

	<%
		Object errorObj = session.getAttribute("error");
		String errorMsg = "";
		if (errorObj != null) {
			errorMsg = errorObj.toString();
		}
	%>
	<div class="login-box">
		<div class="logo-img">
			<img src="assets/images/logo2_03.png" alt="" />
		</div>
		<form action="loginAction.jsp" class="am-form" data-am-validator>
		    
			<div class="am-form-group">
				<label for="doc-vld-name-2"><i class="am-icon-user"></i></label> <input
					type="text" id="doc-vld-name-2" name="name" minlength="2"
					placeholder="输入用户名（至少 3 个字符）" required />
			</div>

			<div class="am-form-group">
				<label for="doc-vld-email-2"><i class="am-icon-key"></i></label> <input
					type="email" id="doc-vld-email-2" name="email" placeholder="输入邮箱"
					required />
			</div>
			<p class="error"><%=errorMsg%></p>
			<button class="am-btn am-btn-secondary" type="submit">登录</button>
			

		</form>
	</div>
</body>
</html>
