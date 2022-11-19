<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Customer Management</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-light bg-light">
  <a class="navbar-brand" href="#">Customer Management System</a>
</nav>
<div class="container mt-2 mb-2">
<a href="${pageContext.request.contextPath}/customer/showForm"><button type="button" class="btn btn-primary">Add Customer</button></a>
</div>
<div class="container">
<div class="row">
<div class="col-md-10">
<table class="table table-striped">
  <thead>
    <tr>
      <th scope="col">FirstName</th>
      <th scope="col">LastName</th>
      <th scope="col">Email</th>
      <th scope="col">Actions</th>
    </tr>
  </thead>
  <tbody>
  <c:forEach var="customer" items="${customers}">
  <!-- update link -->
  <c:url var="updateLink" value="/customer/showUpdateForm">
   <c:param name="customerId" value="${customer.id}"></c:param>
  </c:url>
  
  <!-- delete link -->
  <c:url var="deleteLink" value="/customer/delete">
   <c:param name="customerId" value="${customer.id}"></c:param>
  </c:url>
  
    <tr>
      <td>${customer.firstName}</td>
      <td>${customer.lastName}</td>
      <td>${customer.email}</td>
       <td><a href="${updateLink}"><button type="button" class="btn btn-secondary">Update</button></a></td>
       <td><a href="${deleteLink}"><button type="button" class="btn btn-danger">delete</button></a></td>
    </tr>
     </c:forEach>
  </tbody>
</table>

</div>
</div>
</div>
</body>
</html>