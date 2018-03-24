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

			// ���ݿ������ַ���
			//integratedSecurity=true; Ϊ����ϵͳ��¼������Ҫ�û��������룬��Ҫsqljdbc_auth.dll�ŵ�system32��
			String conn = "jdbc:sqlserver://localhost:1433;DatabaseName=webdb;integratedSecurity=true;";
			// ���ݿ��û���
			String username = "sa";
			// ���ݿ�����
			String passW = "123456";
			
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			// ����Connection����
			con = DriverManager.getConnection(conn);
			//con = DriverManager.getConnection(conn,username,passW);
			System.out.println("�������ݿ�ɹ�");
			// ��ȡStatement
			stmt = con.createStatement();
			// ��ѯ���
			String query = "select * from tb_user WHERE 1=1";
			// ִ�в�ѯ
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
