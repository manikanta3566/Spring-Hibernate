<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>student form</title>
</head>
<body>
<form:form action="proccessform" modelAttribute="student">
FirstName : <form:input path="firstName"/>
<br>
<br>
LastName : <form:input path="lastName"/>
<br>
<br>
Country : <form:select path="country">
<%-- <form:option value="brazil" label="brazil"></form:option>
<form:option value="india" label="india"></form:option>
<form:option value="japan" label="japan"></form:option>
<form:option value="france" label="france"></form:option> --%>

<form:options items="${student.countryOptions}"></form:options>
</form:select>
<br><br>
<form:radiobutton path="programmingLanguage" value="Java"/> Java
 <form:radiobutton path="programmingLanguage" value="PHP"/> PHP
 <form:radiobutton path="programmingLanguage" value="Python"/> Python
<form:radiobutton path="programmingLanguage" value="Javascript"/> JavaScript
<form:radiobutton path="programmingLanguage" value="C++"/> C++
<br><br>

Operating Systems :
<form:checkbox path="operatingSystems" value="Linux"/> Linux
<form:checkbox path="operatingSystems" value="Mac OS"/> Mac OS
<form:checkbox path="operatingSystems" value="MS windows"/> MS Windows


<br><br>
<button type="submit">submit</button>
</form:form>

</body>
</html>