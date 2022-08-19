<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Your Add Subjects</h1>
	<ol style="list-style-type: disc;">
		<c:forEach var="subject" items="${requestScope.subject_list}">
			<li><b>${subject.title} </b>-> &nbsp;   ${subject.title}</li>
		</c:forEach>
	</ol>
	<h1>
		<a href="<spring:url value="/teacher/add" />">Add New Subjects</a>
	</h1>
</body>
</html>