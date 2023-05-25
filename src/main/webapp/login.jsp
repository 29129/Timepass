<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


	<form action="login">
	<center>
	<h1>Login</h1>
<table border="1">
		<tr>
			<th>User name</th>
			<td><input type="text" name="username"></td>
		</tr>
		<tr>
			<th>Password</th>
			<td><input type="password" name="pass"></td>
		</tr>
		<tr>
		<td><input type="radio" name="adminflag" value="1" checked>Admin<br></td>
  		<td><input type="radio" name="adminflag" value="0">User<br></td>
		</tr>
		<tr>	
			<th><a href="index.jsp">Register</a></th>
			<td><input type="submit" value="ok" name="ok"></td>
		</tr>
</table>
</center>
	</form>

</body>
</html>