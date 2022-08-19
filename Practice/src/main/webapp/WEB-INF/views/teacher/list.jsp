<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table style="border-style:none ">

		<tr>
			<td>${requestScope.user.id}</td>

			<td>${requestScope.user.name}</td>

			<td>${requestScope.user.password}</td>
			
			<td>
			  <a href="<spring:url value='/teacher/addsubject?id=${requestScope.user.id}'/>">Add</a>
			</td>
			<td>
               <a href="<spring:url value='/teacher/edit?id=${requestScope.user.id}'/>"> Edit  </a>			
			</td>
		</tr>

	</table>
</body>
</html>