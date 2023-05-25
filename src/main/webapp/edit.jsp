<%@page import="com.example.demo.model.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		Employee emp = (Employee) request.getAttribute("emp");
	%>

	<form action="update">
		<table border="1">
			<tr>
				<td>Employee ID</td>
				<td><input id="eid" type="text" name="id"
					value="<%=emp.getId()%>"></td>
			</tr>
			<tr>
				<td>Name</td>
				<td><input type="text" name="name" value="<%=emp.getName()%>"></td>
			</tr>
			<tr>
				<td>Address</td>
				<td><input type="text" name="address"
					value="<%=emp.getAddress()%>"></td>
			</tr>

			<tr>
				<td>Email</td>
				<td><input type="text" name="email" value="<%=emp.getEmail()%>"></td>
			</tr>
			<tr>
				<td>Mobile No</td>
				<td><input type="text" name="mob" value="<%=emp.getMob()%>"></td>
			</tr>

			<tr>
				<td>User Name</td>
				<td><input type="text" name="username" value="<%=emp.getUsername()%>"></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><input type="password" name="pass" value="<%=emp.getPass()%>"></td>
				</td>
			</tr>
			<tr>
				<td><input type="submit" value="update"></td>
			</tr>
		</table>
	</form>
</body>
</html>