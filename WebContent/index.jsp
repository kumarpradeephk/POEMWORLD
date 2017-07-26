<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css"
integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7" crossorigin="anonymous">
<link rel="stylesheet" type="text/css"  href="style1.css">
<title>Welcome To PoemWorld</title>
<style type="text/css">
body{
background: url("image/blue.jpg");
background-attachment:fixed;
}
#div1{
height: 30%;
}
#div2{
height: 60%;
}
#main{
height: 100%;
width: 100%;
}
h1{
text-align: center;
font-weight:300; 
margin-top: 10%;
font-size: 70px;
color:fuchsia;
}
</style>
</head>
<body>
<div id="main">
<div id="div1">
<h1>Read favourite Poem and fantastic  Story</h1>
</div>
<div id="div2" class="row text-center" style="align:center;margin-top: 5%;">
<a href="home.jsp"><button class="btn btn-success btn-lg">WELCOME!</button></a>
</div>
<div  class="col-xs-12"  style="align:center;margin-top: 15%; color:maroon;">
<a href="Login.jsp"><button class="btn btn-success btn-xs pull-right" style="color:maroon;">login here</button></a>
<a href="Register.jsp"><button class="btn btn-success btn-xs pull-right" style="color:maroon;">Register here</button></a>
</div>
</div>
</body>
</html>