<%@ page language="java" contentType="text/html; charset=UTF-8"
	import="java.sql.*" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>执行登录逻辑</title>
</head>
<body>

	<%
		String userName = request.getParameter("name");
		String email = request.getParameter("email");

		System.out.println("userName=" + new String(userName.getBytes("iso-8859-1"), "utf-8"));
		System.out.println("email=" + email);

		if (userName == null || userName.length() <= 0) {
			session.setAttribute("error", "请填写用户名");
			response.sendRedirect("login.jsp");
		} else {
			if (userName.length() > 8) {
				session.setAttribute("error", "用户名过长！不能超过8个字符！");
				response.sendRedirect("login.jsp");
			} else {
				/*
				//连接数据库
				Connection con = null;
				Statement stmt = null;
				ResultSet rs = null;
				try {
					// 数据库连接字符串
					String conn = "jdbc:sqlserver://localhost:1433;DatabaseName=webdb";
					// 数据库用户名
					String username = "sa";
					// 数据库密码
					String passW = "123456";
					Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
					// 创建Connection连接
					con = DriverManager.getConnection(conn, username, passW);
					System.out.println("连接数据库成功");
					// 获取Statement
					stmt = con.createStatement();
					// 查询语句
					String query = "select * from tb_user WHERE 1=1";
					// 执行查询
					rs = stmt.executeQuery(query);
					while (rs.next()) {
						System.out.println(rs.getString(1) + " " + rs.getString(2));
					}
				} catch (Exception e) {
					e.printStackTrace();
				} finally {
					if (rs != null)
						try {
							rs.close();
						} catch (Exception e) {
						}
					if (stmt != null)
						try {
							stmt.close();
						} catch (Exception e) {
						}
					if (con != null)
						try {
							con.close();
						} catch (Exception e) {
						}
				}
				*/
				session.setAttribute("userName", new String(userName.getBytes("iso-8859-1"), "utf-8"));
				response.sendRedirect("index.jsp");
			}

		}
		System.out.println("ok");
	%>

</body>
</html>