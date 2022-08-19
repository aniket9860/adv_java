<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form:form action="edit/${requestScope.id}" method="post" modelAttribute="user">
		<table style="background-color: lightgrey; margin: auto">
			<tr>
				<td>Enter name</td>
				<td><form:input type="text" path="name"
						value="${sessionScope.user_dtls.name}" /></td>
			</tr>

			<tr>
				<td>Enter password</td>
				<td><form:input type="password" path="password"
						value="${sessionScope.user_dtls.password}" /></td>
			</tr>

			<tr>
				<td><input type="submit" value="Update">
			</tr>

		</table>
	</form:form>
</body>
</html>