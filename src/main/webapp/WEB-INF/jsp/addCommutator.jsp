<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->

<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css"
	integrity="sha384-9gVQ4dYFwwWSjIDZnLEWnxCjeSWFphJiwGPXr1jddIhOegiu1FwO5qRGvFXOdJZ4"
	crossorigin="anonymous">
<title>Insert title here</title>
</head>
<body>
	<div class="container">
		<form:form method="POST" action="addCommutator" modelAttribute="commutator">
			<div class="row">
				<div class="col">
					<div class="form-group">
						<form:label path="inverterId">Внутренний номер</form:label>
						<form:input class="form-control" path="inverterId"/>
					</div>
				</div>
				<div class="col">
					<div class="form-group">
						<form:label path="location">Местоположение</form:label>
						<form:input path="location" class="form-control"/>
					</div>
				</div>
				<div class="col">
					<div class="form-group">
						<form:label path="commutatorModel">Модель</form:label> 
						<form:input path="commutatorModel" class="form-control"/>
					</div>
				</div>
				<div class="col">
					<div class="form-group">
						<form:label path="port">Порт</form:label>
						<form:input path="port"	class="form-control"/>
					</div>
				</div>
				<div class="col">
					<div class="form-group">
						<form:label path="fc">FC</form:label>
						<div>
							<form:checkbox class="form-check-input" path="fc"/>
						</div>
					</div>
				</div>
			</div>
			<button type="submit" class="btn btn-success">Добавить</button>
		</form:form>
	</div>
	<!-- Optional JavaScript -->
	<!-- jQuery first, then Popper.js, then Bootstrap JS -->
	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
		integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
		crossorigin="anonymous"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.0/umd/popper.min.js"
		integrity="sha384-cs/chFZiN24E4KMATLdqdvsezGxaGsi4hLGOzlXwp5UZB1LY//20VyM2taTB4QvJ"
		crossorigin="anonymous"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/js/bootstrap.min.js"
		integrity="sha384-uefMccjFJAIv6A+rW+L4AHf99KvxDjWSu1z9VI8SKNVmz4sk7buKt/6v9KI65qnm"
		crossorigin="anonymous"></script>
</body>
</html>