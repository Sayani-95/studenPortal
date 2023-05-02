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

		<h1>Edit Student</h1>
		<form action="updateStudent" method="post" modelAttribute="student">

			<div class="row">
				<div class="col">
					<div class="form-group">
						<label for="id">Id</label> <input type="text"
							value="${student.id}" class="form-control" id="id" name="id"
							readonly="readonly">
					</div>
				</div>
			</div>

			<div class="row">
				<div class="col">
					<div class="form-group">
						<label for="name">Name</label> <input type="text"
							value="${student.name}" class="form-control" id="name" name="name"
							placeholder="Enter Name">
					</div>
				</div>
			</div>
				<div class="row">
				<div class="col">
					<div class="form-group">
						<label for="age">Age</label> <input type="number"
							value="${student.age}" class="form-control" id="age" name="age"
							placeholder="Enter Age">
					</div>
				</div>
			</div>

			<div class="row">
				<div class="col">
					<div class="form-group">
						<label for="course">Course</label> <input
							type="text" value="${student.course}" class="form-control" id="course"
							name="course" placeholder="Enter Course">
					</div>
				</div>
				</div>
				<div class="row">
				<div class="col">
					<div class="form-group">
						<label for="grade">Overall Grade</label> <input type="text"
							value="${student.grade}" class="form-control" id="grade" name="grade"
							placeholder="Enter Grade">
					</div>
				</div>
			</div>

			<button type="submit" class="btn btn-primary">Submit</button>
		</form>

	</div>

</body>
</html>