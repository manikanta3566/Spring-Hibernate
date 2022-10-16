<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>student confirmation page</title>
</head>
<body>

<h1>student first name is ${student.firstName}</h1>

<h1>student last name is ${student.lastName}</h1>

<h1>Student country is ${student.country}</h1>

<h1>Student programming language is ${student.programmingLanguage}</h1>

operating Systems :
<ul>
<c:forEach var="os" items="${student.operatingSystems}">
<li>${os}</li>
</c:forEach>
</ul>

</body>
</html>