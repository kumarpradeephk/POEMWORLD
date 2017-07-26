<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration Page</title>

<style>
#styling{
background-color: blue;
color:white;
font-size:15px;

}
#styling1{
background-color: blue;
color:black;
font-size:20px;
}
h1{
font-size: 55px;
}
</style>

</head>
<body style="margin:0px">
<div align="center" style="margin-top: 3%;">
<h1>Please Register Here</h1>
<div id="styling1" style="background-color: pink">
<form action="Register" method="post">
<table>
<tr><td>First Name</td> <td>:</td> <td><input type="text" name="fname"></input></td></tr>
<tr><td>Last Name</td> <td>:</td> <td><input type="text" name="lname"></input></td></tr>
<tr><td>DOB</td><td>:</td>
<td><input type="text" name="dob"></input></td></tr>
<tr><td>Email Id </td><td>:</td> <td>
<input type="text" name="email" size="35" required placeholder="abcde@gmail.com"></td></tr>
<tr><td>Mobile number</td> <td>:</td> <td>
<input type="text" name="mobile"></input></td></tr>
<tr><td>Gender</td><td>:</td><td>
<input type="radio" name="gender" value="M">Male</td> <td><input type="radio" name="gender" value="F">Female</td></tr>							
<tr><td>USER NAME</td> <td>:</td> <td><input type="text" name="user"></input></td></tr>
<tr><td>PASSWORD</td> <td>:</td> <td><input type="text" name="password"></input></td></tr>
<tr><td colspan="6"><input type="submit" name="submit" value="Submit!">
</td></tr>
</table>
</form>
</div>
</div>
</body>
</html>