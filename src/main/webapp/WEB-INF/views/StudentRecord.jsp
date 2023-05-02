<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<%@include file="./style.jsp"%>
</head>
<body>


	<div class="container mt-3">

		<h1>Student Record</h1>
		<a href="addStudent" class="btn btn-primary"> Add Student </a>
		<a href="http://localhost:8080/StudentPortal/" class="btn btn-primary text-center">Logout</a>
		<div class="row">

			<table class="table table-hover">
				<thead>
					<tr>
						<th scope="col">ID</th>
						<th scope="col">Name</th>
						<th scope="col">Age</th>
						<th scope="col">Course</th>
						<th scope="col">Overall Grade</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="stu" items="${student}">
						<tr>
							<td class="table-plus">${stu.id}</td>
							<td>${stu.name}</td>
							<td>${stu.age}</td>
							<td>${stu.course}</td>
							<td>${stu.grade}</td>
							<td><a href="editStudent/${stu.id}" class="btn btn-info">
									Edit </a></td>
							<!--  <td><a href="deleteStudent/${stu.id}"
								class="btn btn-dark"> Delete </a></td> -->
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>

</body>
</html>