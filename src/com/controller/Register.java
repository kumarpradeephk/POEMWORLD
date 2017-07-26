package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.omg.CORBA.Request;

import com.database.UserDao;
import com.model.User;
import com.mysql.jdbc.Connection;

/**
 * Servlet implementation class Register
 */
@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Register() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		User u=new User();
		int status=0;
		u.setFname(request.getParameter("fname"));
		u.setLname(request.getParameter("lname"));
		u.setDob(request.getParameter("dob"));
		u.setEmail(request.getParameter("email"));
		u.setMobile(request.getParameter("mobile"));
		u.setGender(request.getParameter("gender"));
		u.setUser(request.getParameter("user"));
		u.setPassword(request.getParameter("password"));
		if(u.getUser().equals("")||u.getPassword().equals(""))
		{
			out.print("<font color='green'>ENTER USER_NAME AS WELL AS PASSWORD</font>");
			RequestDispatcher rd=request.getRequestDispatcher("Register.jsp");
			rd.include(request, response);
		}
		else
		{
			status=UserDao.save(u);
			if(status>0)
			{
				out.print("<font color='green'>REGISTER SUCCESS</font>");
				RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
				rd.include(request, response);
			}
		else if(UserDao.error.equals("Duplicate entry '"+u.getEmail()+"' for key 'PRIMARY'"))
			{
				out.print("<font color='red'>ALREADY REGISTERED</font>");
				RequestDispatcher rd=request.getRequestDispatcher("register.jsp");
				rd.include(request, response);
			}
	
			else
			{
				out.print("<font color='red'>REGISTRATION FAILURE:-</font>");
				out.print("<font color='red'>Mobile Number Already used</font>");
				RequestDispatcher rd=request.getRequestDispatcher("Register.jsp");
				rd.include(request, response);
			}
	}
	
	}
}
