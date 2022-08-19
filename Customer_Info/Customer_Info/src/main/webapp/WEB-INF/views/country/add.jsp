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
	<form:form modelAttribute="country">
		<table>
			<tr>
				<td>Country Continent:</td>
				<td><form:input path="continent" /></td>
			</tr>
			<tr>
				<td>Country Name:</td>
				<td><form:input path="countryName" /></td>
			</tr>
			<tr>
				<td>Country Population:</td>
				<td><form:input path="population" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="Add Country" /></td>
			</tr>
		</table>
	</form:form>

</body>
</html>