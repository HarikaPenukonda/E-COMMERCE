
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Signin Page</title>
</head>
<body>
<center>
<h1>Login</h1>
<form method="post" action="perform_login">
<table>

<tr><td>User name:</td><td><input type="text" name="username"></td></tr>
 
<tr><td>Enter Password</td><td><input type="password" name="password" ></td></tr>

<tr><td>
<input type="submit" value="submit"></td><td>
<input type="reset" value="reset"></td></tr>


</table>
</form>


</center>

</body>
</html>