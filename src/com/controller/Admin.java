package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.database.UserDao;
import com.model.Provider;
import com.model.User;

/**
 * Servlet implementation class Admin
 */
@WebServlet("/Admin")
public class Admin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Admin() {
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
		
		try {
			
			User u=new User();
			String qry1="insert into poem_info(mobile,heading,poem) values(?,?,?)";
		//	String qry2="select pid,heading  from poem_info";
			u.setMobile(request.getParameter("mobile"));
			u.setHeading(request.getParameter("heading"));
			u.setPoem(request.getParameter("poem"));
			Connection con=Provider.getConnection();
			PreparedStatement pstmt=con.prepareStatement(qry1);
			pstmt.setString(1,u.getMobile());
			pstmt.setString(2,u.getHeading());
			pstmt.setString(3,u.getPoem());
			int status=pstmt.executeUpdate();
			//ResultSetMetaData rsmd= (ResultSetMetaData) rs.getMetaData();
			if(status>0)
			{
			out.print("<marquee><font color='green'><h1>Thank you! You have Successfully Posted.</marquee><br>");
			RequestDispatcher rd=request.getRequestDispatcher("Admin.jsp");
			rd.include(request, response);
			}
		} catch (Exception e) {
			// TODO: handle exception
			out.print("<marquee><font color='red'><h1>Blank field/incorrect Mobile no.</marquee><br>");
			RequestDispatcher rd=request.getRequestDispatcher("Admin.jsp");
			rd.include(request, response);
		}
		
	}

}
