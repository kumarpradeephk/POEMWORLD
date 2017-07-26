<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@ page import="java.io.IOException" %>
   <%@ page import="java.sql.*" %>
    <%@ page import="com.model.Provider" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Timeline Page</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css"
integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7" crossorigin="anonymous">
<link rel="stylesheet" type="text/css"  href="style1.css">
<style type="text/css">
body{
background: url("image/wood.jpg");
background-attachment:fixed;
}
</style>
</head>
<body>
<%
String USER="";
try {
//	String qry="select * from poem_info";
    String qry1="select * from poem_info inner join users on poem_info.mobile=users.mobile";
//	fname5,lname6,heading3
	Connection con=Provider.getConnection();
	Statement stmt=con.createStatement();
	ResultSet rs=stmt.executeQuery(qry1);
	ResultSetMetaData rsmd= rs.getMetaData();
%>
		<h1 style="font-family:fantasy;color: teal;text-align: center;text-decoration: blink;">Welcome to My POEM WORLD</h1>
<%	
	while(rs.next())
	{
%>
		<div style="text-align:center;width:35%;" class="container well" align="center">

		<h2 style="text-align: center;font-weight: bolder;color:maroon;"><b>
		<%
			out.print(rs.getString(3)+"<br>");
		%>
		</b></h2>
		<%
			out.print(rs.getString(4));
		%>
		<h6 style="text-align: right;font-family: cursive;color:olive;"><b>
		<%
		    out.print(" - "+rs.getString(5)+" "+rs.getString(6)+"<br>");
		%>
		</b></h6>
		</div><br>
<%
	
	}
} catch (Exception e) {
	// TODO: handle exception
}
%>
</body>
</html>