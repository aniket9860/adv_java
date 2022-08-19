<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Subject</title>
</head>
<body>
	<h1 style="color: red">${requestScope.mesg}</h1>
	<h1>Add New Subject</h1>
	<form:form method="post" modelAttribute="subject">
		<table style="margin: auto">

			<tr>
				<td><form:input type="text" path="title"
						placeholder="Enter Title" /></td>
			</tr>
			
			<tr>
				<td><form:input type="text" path="content"
						placeholder="Add content" /></td>
			</tr>

			<tr>
				<td><input type="submit" value="Add New Subject" /></td>
			</tr>

		</table>
	</form:form>


</body>
</html>