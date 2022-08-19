<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<label> <a href="addCountry">Add_Country</a>&nbsp;&nbsp;&nbsp;
		<a href="sort">Sort</a></label>
	<table>
		<tr>
			<td>Name</td>
			<td>Continent</td>
			<td>Population</td>
			<td>Deletion</td>
		</tr>

		<c:forEach var="country" items="${requestScope.Country_List}">
			<tr>
				<td>${country.countryName}</td>
				<td>${country.continent}</td>
				<td>${country.population}</td>
				<%-- <td><a href="delete?id=${country.id}">Delete</a></td> --%>
				<td><a href="<spring:url value='/country/delete?id=${country.id}'/>">Delete</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>