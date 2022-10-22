<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
      <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<style>
.error{
color: red;
}
</style>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form:form action="processform" modelAttribute="customer">
FirstName: <form:input path="firstName"/>
<form:errors path="firstName" cssClass="error"></form:errors>
<br><br>
lastName: <form:input path="lastName"/>
<br><br>
freePasses: <form:input path="freePasses"/>
<form:errors path="freePasses" cssClass="error"></form:errors>
<br><br>
courseCode: <form:input path="courseCode"/>
<form:errors path="courseCode" cssClass="error"></form:errors>
<br><br>
<button type="submit">Submit</button>
</form:form>

</body>
</html>