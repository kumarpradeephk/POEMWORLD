package com.model;

import java.sql.Connection;
import java.sql.DriverManager;

public class Provider {

	static String url="jdbc:mysql://localhost:3306/company";
	static String user_name="root";
	static String password="system";
	static String driver="com.mysql.jdbc.Driver";
	public static Connection getConnection() 
	{
		Connection con=null;
	try {
		Class.forName(driver);
		con=DriverManager.getConnection(url, user_name, password);
	} catch (Exception e) {
		// TODO: handle exception
	}
	return con;	
	}
}
