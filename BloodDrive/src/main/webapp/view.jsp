<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Student Details</h2>
	<c:if test="${not empty studentList }">
		<table>
			<tr>
				<th>ID</th>
				<th>NAME</th>
				<th>COURSE</th>
			</tr>
			<c:forEach items="${studentList}" var="student">
				<tr>
					<td>${student.id }</td>
					<td>${student.name }</td>
					<td>${student.course }</td>
					<td><a href="delete/${student.id }">Delete</a></td>
					<td><a href="update?id=${student.id }&name=${student.name}&course=${student.course}">Update</a></td>
					</tr>
					</c:forEach>
		</table>
		</c:if>
</body>
</html>