<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Page</title>
<style type="text/css">
h1{
font-size: 70px;
}
h3{
font-size: 25px;
}
</style>
</head>
<body style="background-color: olive;">
<div align="center" style="margin-top: 8%;">
<h1>Please login here!</h1><br>
<form action="Login" method="post">
<table>
<tr><td><h3>User Name</h3></td><td><input type="text" name="user" required style="width: 200px;height: 25px;"></td></tr>
<tr><td><h3>Password</h3></td><td> <input type="password" name="password" required style="width: 200px;height: 25px;"></td></tr>
<tr><td></td><td><input type="submit" value="login" style="width:200px; font-size: 20px;"></td></tr>
</table>
</form>
</div>
</body>
</html>