<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
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
<div class="container">
<div class="row">
<div class="col-md-10">
<form:form action="saveContact" modelAttribute="customer"  method="POST">
  <form:hidden path="id"/>

  <div class="form-group">
    <label >FirstName</label>
    <form:input path="firstName" cssClass="form-control"/>
  </div>
    <div class="form-group">
    <label >LastName</label>
    <form:input path="lastName" cssClass="form-control"/>
  </div>
    <div class="form-group">
    <label >Email</label>
    <form:input path="email" cssClass="form-control"/>
  </div>
  <!-- <div class="form-group">
    <label for="lastname">FirstName</label>
    <input type="text" class="form-control" id="lastname" >
  </div> -->
  <button type="submit" class="btn btn-primary">Submit</button>
  </form:form>

</div>
</div>
</div>s
</html>