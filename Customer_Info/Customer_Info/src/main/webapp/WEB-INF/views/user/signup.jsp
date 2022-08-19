<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form:form modelAttribute="user">
		<table>
			<tr>
				<td>Employee Name:</td>
				<td><form:input path="name" /></td>
			</tr>
			<tr>
				<td>Employee Email:</td>
				<td><form:input type="email" path="email" /></td>
			</tr>
			<tr>
				<td>Employee Password:</td>
				<td><form:input type="password" path="password" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="Add New Employee" /></td>
			</tr>
		</table>
	</form:form>
</body>
</html>