<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@include file="./style.jsp"%>
</head>
<body>


	<div class="container mt-3">

		<h1>Add Student</h1>
		<form action="insertStudent" method="post" modelAttribute="student">

			<div class="row">
				<div class="col">
					<div class="form-group">
						<label for="name">Name</label> <input type="text"
							class="form-control" id="name" name="name"
							placeholder="Enter Name">
					</div>
				</div>
			</div>
				<div class="row">
				<div class="col">
					<div class="form-group">
						<label for="age">Age</label> <input type="number"
							class="form-control" id="age" name="age"
							placeholder="Enter Age">
					</div>
				</div>
			</div>

			<div class="row">
				<div class="col">
					<div class="form-group">
						<label for="course">Course</label> <input
							type="text" class="form-control" id="course"
							name="course" placeholder="Enter Course">
					</div>
				</div>
				</div>
				<div class="row">
				<div class="col">
					<div class="form-group">
						<label for="grade">Overall Grade</label> <input type="text"
							class="form-control" id="grade" name="grade"
							placeholder="Enter Grade">
					</div>
				</div>
			</div>
			<a href="http://localhost:8080/StudentPortal/home"
				class="btn btn-warning"> Back </a>
			<button type="submit" class="btn btn-primary">Submit</button>
		</form>

	</div>

</body>
</html>