<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<script
			src="http://ajax.googleapis.com/ajax/libs/jquery/1.5/jquery.min.js">
	</script>
<!-- Bootstrap CSS -->

<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css"
	integrity="sha384-9gVQ4dYFwwWSjIDZnLEWnxCjeSWFphJiwGPXr1jddIhOegiu1FwO5qRGvFXOdJZ4"
	crossorigin="anonymous">


<title>Hello, world!</title>
</head>
<body>
	<script type="text/javascript">
	function doAjax() {
		$.ajax({
			url: 'checkID',
			data: ({inverterId:$('#inverterId').val()}),
			success: function(data){
				$('#resultValue').html(data);
			}
		});
	}
	</script>

<div id="resultValue"></div>
	<div class="conteiner">
		<form:form method="post" command="command" action="addMonitor">
			<div class="row">
				<div class="col">
					<div class="form-group">
						<form:label path="inverterId">Внутренний номер</form:label>
						<form:input class="form-control" path="inverterId" onclick="doAjax()" />
					</div>
				</div>
				<div class="col">
					<div class="form-group">
						<form:label path="location">Местоположение</form:label>
						<form:input class="form-control" path="location" />
					</div>
				</div>
				<div class="col">
					<div class="form-group">
						<form:label path="monitorModel">Модель</form:label>
						<form:input class="form-control" path="monitorModel" />
					</div>
				</div>
				<div class="col">
					<div class="form-group">
						<form:label path="brand">Бранд</form:label>
						<form:select class="form-control" path="brand">
							<c:forEach var="brand" items="${brandAll}">
								<form:option value="${brand.getId()}">
								<c:out	value="${brand.getBrand()}"></c:out>
								</form:option>
							</c:forEach>
						</form:select>
					</div>
				</div>
				<div class="col">
					<div class="form-group">
					<form:label path="diagonal">Диагональ</form:label>
						<form:select class="form-control" path="diagonal">
							<c:forEach var="diagonal" items="${diagonalAll}">
								<form:option value="${diagonal.getId()}">
								<c:out value="${diagonal.getDiagonal()}"></c:out>
								</form:option>
							</c:forEach>
						</form:select>
					</div>
				</div>
			</div>
			<button type="submit" class="btn btn-success">Добавить</button>
		</form:form>
	</div>

	<%-- <div class="conteiner">
		<form action="FrontController">
			<input type="hidden" name="command" value="addMonitor" />
			<div class="row">
				<div class="col">
					<div class="form-group">
						<label for="inventory_id">Внутренний номер:</label> <input
							type="text" class="form-control" name="inventory_id" value="">
					</div>
				</div>
				<div class="col">
					<div class="form-group">
						<label for="location">Местоположения:</label> <input type="text"
							class="form-control" name="location" value="">
					</div>
				</div>
				<div class="col">
					<div class="form-group">
						<label for="model">Модель:</label> <input type="text"
							class="form-control" name="model" value="">
					</div>
				</div>
			<div class="col">
			<div class="form-group">
				<label for="brand">Select list:</label> <select class="form-control"
					name="brand" value="">
					<c:forEach var="brand" items="${brandAll}">
						<option value="${brand.getId()}"><c:out value="${brand.getBrand()}"></c:out>
					</c:forEach>
				</select>
			</div>
		</div>
		<div class="col">
			<div class="form-group">
				<label for="diagonal">Select list:</label> <select class="form-control"
					name="diagonal" value="">
					<c:forEach var="diagonal" items="${diagonalAll}">
						<option value="${diagonal.getId()}"><c:out value="${diagonal.getDiagonal()}"></c:out>
					</c:forEach>
				</select>
			</div>
		</div>
			</div>
			<button type="submit" class="btn btn-success">Добавить</button>
		</form>
	</div> --%>

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