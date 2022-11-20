<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<h1>welcome to Home page</h1><br>
<hr>
<h1>user name :<security:authentication property="principal.username"/></h1><br>
<h1>user roles :<security:authentication property="principal.authorities"/></h1>
<hr>
<form:form action="${pageContext.request.contextPath}/logout" method="POST">
    <input type="submit" value="logout"/>
</form:form>
</body>
</html>