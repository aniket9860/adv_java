<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<table style="background-color: lightgrey; margin: auto">
		<caption>All Teachers</caption>
		<c:forEach var="teacher" items="${requestScope.teachers}">
			<tr>
				<td>${teacher.id}</td>
				<td>${teacher.name}</td>
				<td>${teacher.password}</td>
				<td>
					<a href="<spring:url value='/admin/delete?id=${teacher.id}'/>">Delete</a>
				</td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>