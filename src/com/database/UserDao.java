package com.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.model.Provider;
import com.model.User;


public class UserDao {
	public static String error;
	public static int save(User u) {
		// TODO Auto-generated method stub
		int status=0;
		try {
			Connection con=Provider.getConnection();
			String qry="insert into users values(?,?,?,?,?,?,?,?)";
			PreparedStatement pstmt=con.prepareStatement(qry);
			pstmt.setString(1, u.getFname());
			pstmt.setString(2, u.getLname());
			pstmt.setString(3, u.getDob());
			pstmt.setString(4, u.getEmail());
			pstmt.setString(5, u.getMobile());
			pstmt.setString(6, u.getGender());
			pstmt.setString(7, u.getUser());
			pstmt.setString(8, u.getPassword());
			status=pstmt.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
	    	error=e.getMessage();
			e.printStackTrace();
		}
		return status;
	}
	public static boolean Validate(User u) {
		// TODO Auto-generated method stub
		boolean status=false;
		try
		{
			Connection con=Provider.getConnection();
			String qry="select * from users where user=? and password=?";
			PreparedStatement pstmt=con.prepareStatement(qry);
			pstmt.setString(1,u.getUser());
			pstmt.setString(2,u.getPassword());
			ResultSet rs=pstmt.executeQuery();
			status=rs.next();
			String get=rs.getString(8);
			if(status && get.equals(u.getPassword()))
			{
				status=true;
			}
			else
			{
				status=false;
			}
		}
		catch(Exception e)
		{
			//System.out.println(e.getMessage());
			e.printStackTrace();
		}
		return status;
	}

}
