<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>update</title>
</head>
<body>
<form method="post" action="/updateAction">
Name:<input type="text" name="name" value="${student.name } "><br>
Course:<input type="text" name="course" value="${student.course}"><br>
<input type="hidden" name="id" value="${student.id }"><br>
<input type="submit" value="UPDATE">
</form>
</body>
</html>