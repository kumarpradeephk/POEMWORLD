package com.database;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Forgot
 */
@WebServlet("/Forgot")
public class Forgot extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Forgot() {
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
		boolean status=false;
		String url="jdbc:mysql://localhost:3306/company";
		String user_name="root";
		String user_password="system";
		String name=request.getParameter("name");
		String password=request.getParameter("password");
		String password1=request.getParameter("password1");
		String password2=request.getParameter("password2");
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection(url,user_name,user_password);
			String qry="select * from user where name=? and password=?";
			PreparedStatement ps=con.prepareStatement(qry);
			ps.setString(1,name);
			ps.setString(2, password);
			ResultSet rs=ps.executeQuery();
			status=rs.next();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		if(status)
		{
			if(password1.equals("")||password2.equals(""))
			{
				out.print("<font color='red'>PASSWORD FIELD SHOULD NOT BE BLANK</font>");
				RequestDispatcher rd=request.getRequestDispatcher("forgot.html");
				rd.include(request, response);
			}
			else if(password.equals(password1)&&password1.equals(password2))
			{
				out.print("<font color='red'>ENTER OTHER THAN PREVIOUS PASSWORD</font>");
				RequestDispatcher rd=request.getRequestDispatcher("forgot.html");
				rd.include(request, response);
			}
			else if(password1.equals(password2))
			{
				try
				{
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection(url,user_name,user_password);
					String qry="update user set password=? where name=?";
					PreparedStatement ps=con.prepareStatement(qry);
					ps.setString(1, password1);
					ps.setString(2,name);
					ps.execute();
				}
				catch(Exception e)
				{
					System.out.println(e.getMessage());
				}
				out.print("<font color='GREEN'>PASSWORD HAS BEING CHANGED</font>");
				RequestDispatcher rd=request.getRequestDispatcher("index.html");
				rd.include(request, response);
			}
			else
			{
				out.print("<font color='red'>RE-ENTER PASSWORD CORRECTLY</font>");
				RequestDispatcher rd=request.getRequestDispatcher("forgot.html");
				rd.include(request, response);
			}
		}
		else
		{
			out.print("<font color='red'>USER NAME & PASSWORD MISMATCH</font>");
			RequestDispatcher rd=request.getRequestDispatcher("forgot.html");
			rd.include(request, response);
		}
	}

}
