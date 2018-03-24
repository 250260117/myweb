package com.baiyun.lesson;

import java.sql.*;

public class TestDriver {

	public static void main(String[] args) {
		// Create a variable for the connection string.

		// Declare the JDBC objects.
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {

			// 数据库连接字符串
			//integratedSecurity=true; 为利用系统登录，不需要用户名和密码，但要sqljdbc_auth.dll放到system32下
			String conn = "jdbc:sqlserver://localhost:1433;DatabaseName=webdb;integratedSecurity=true;";
			// 数据库用户名
			String username = "sa";
			// 数据库密码
			String passW = "123456";
			
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			// 创建Connection连接
			con = DriverManager.getConnection(conn);
			//con = DriverManager.getConnection(conn,username,passW);
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
		}
		// Handle any errors that may have occurred.
		catch (Exception e) {
			e.printStackTrace();
		}

		finally {
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

	}

}
