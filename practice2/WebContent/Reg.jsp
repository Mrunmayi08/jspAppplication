<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<link rel="stylesheet" href="mycss.css">
<body>
<form action="regController" method="post">
<p>
	<table align="center">
	
		<tr>
		<td>Registration No </td>
		<td><h1><input type="text" name="reg_no"></h1></td>
		</tr>
		
		<tr>
		<td>First Name </td>
		<td><h1><input type="text" name="firstname"></h1></td>
		</tr>
		
		<tr>
		<td>last Name </td>
		<td><h1><input type="text" name="lastname"></h1></td>
		</tr>
		
		<tr>
		<td>User Name </td>
		<td><h1><input type="text" name="username"></h1></td>
		</tr>
		
		<tr>
		<td>Password </td>
		<td><h1><input type="password" name="pass"></h1></td>
		</tr>
		
		<tr>
		<td><h1><input type="submit" value="save" name="save"></h1>
		</td>
		</tr>
		
	</table></p>
	</form>

</body>
</html>