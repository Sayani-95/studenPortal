<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<%@include file="./style.jsp"%>
</head>
<body>
<h1 class="text-center">Welcome to Student Mangement Portal</h1>
<div class="d-flex align-items-center flex-column">
	<a href="addStudent" class="btn btn-primary text-center p-2o"> Add Student </a>
	<br/> 
	<a href="studentRecord" class="btn btn-primary text-center p-2">View Student</a>
	<br/>
	<a href="http://localhost:8080/StudentPortal/" class="btn btn-primary text-center p-2">Logout</a>
</div>
</body>
</html>