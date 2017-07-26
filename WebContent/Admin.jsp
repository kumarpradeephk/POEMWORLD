<%@ page language="java" contentType="text/html; charset=utf8"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admin Page</title>
<style type="text/css">
h2{
font-size: 50px;
}
table{
font-size: 20px;
font-weight: bold;
}
</style>
</head>
<body style="background-color: olive;">
<div align="center" style="margin-top: 1%;">
<h2>Put Your Content in given place!</h2>
<h5>Enter registered mobile no.</h5>
<form action="Admin" method="post">
<table>
<tr><td>Mobile No.</td><td>:</td><td><input type="text" name="mobile"></td></tr>
<tr><td>HEADING</td> <td>:</td> <td><input type="text" name="heading" style="width:400px; align: left"></input></td></tr>
<tr><td>Write your favourite Poem</td></tr>
<tr><td>POEM</td> <td>:</td> <td><textarea name="poem" placeholder="write your poem here!"style="height:400px; width:400px;">
</textarea></td></tr>
<tr><td>Click to Post</td><td>:</td><td><input type="submit" name="GO" value="GO"></td></tr>
</table>
</form>
</div>
</body>
</html>