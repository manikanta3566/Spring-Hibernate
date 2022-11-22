<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>custom login form</title>
</head>
<body>
<h1>Login Form</h1>
<form:form action="${pageContext.request.contextPath}/authenticateUser" method="POST">
<!-- for invalid username and password     -->
    <c:if test="${param.error!=null}">
        <b style="color: red;">invalid username and password</b><br>
    </c:if>

    <!-- for logout message -->
    <c:if test="${param.logout!=null}">
        <b style="color: green;">you have been logged out</b><br>
    </c:if>
Username:<input type="text" name="username"/><br>
password:<input type="password" name="password"/><br>
<input type="submit" value="login"/?
</form:form>
</body>
</html>