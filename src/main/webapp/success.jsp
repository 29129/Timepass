<%@page import="java.util.List"%>
<%@page import="com.example.demo.model.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script type="text/javascript">
function edit(id)
{
	
	alert(id);
	document.fn.action="edit?uid="+id;
	document.fn.submit();
	
	
}

function onDelete(id)
{
	alert(id);
	document.fn.action="delete?uid="+id;
	document.fn.submit();
	
}

function onlogout(id)
{
	alert(id);
	document.fn.action="delete?uid="+id;
	document.fn.submit();
	
}


</script>
<title>Insert title here</title>
</head>
<body>
<form name="fn" method="post">
<table border="1">
	
		<tr>
			<th>ID</td>
			<th>Name</th>
			<th>Address</th>
			<th>Email</th>
			<th>Mobile No</th>
			<th>UserName</th>
			<th>Password</th>
			<th>Action</th>
			<th>Action</th>
			<th>Action</th>
		</tr>
		<%
		
		
		HttpSession sessions=request.getSession(false);
		sessions.getLastAccessedTime();
		List<Employee> emplist = (List<Employee>) sessions.getAttribute("emp");
			for (Employee emp : emplist) {
		%>
		<tr>
		
			<td><%=emp.getId() %>
			<td><%=emp.getName()%></td>
			<td><%=emp.getAddress()%></td>
			<td><%=emp.getEmail()%></td>
			<td><%=emp.getMob()%></td>
			<td><%=emp.getUsername() %></td>
			<td><%=emp.getPass()%></td>
			<td><input type="button"value="Edit" onclick="edit(<%=emp.getId()%>)"></td>
			<td><input type="button"value="Delete" onclick="onDelete(<%=emp.getId()%>)"></td>
			<td><input type="button" value="logout" onclick="onlogout(<%=emp.getId()%>)"></td>
		</tr>

		<%
			}
		%>
	</table>
</form>	
</body>
</html>