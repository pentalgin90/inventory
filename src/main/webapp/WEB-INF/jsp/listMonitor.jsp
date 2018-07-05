<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html lang="en">

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

	<c:out value="${monitors}" />
	<div class="container">
		<table class="table table-hover table-sm">
			<thead style="background-color:LimeGreen;">
				<tr>
					<th>inventoryID</th>
					<th>Местоположение</th>
					<th>Бренд</th>
					<th>Модель</th>
					<th>Диагональ</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="monitor" items="${monitorlist}">
					<tr>
						<td><c:out value="${monitor.getInverterId()}" /></td>
						<td><c:out value="${monitor.getLocation()}" /></td>
						<td><c:out value="${monitor.getBrand().getBrand()}" /></td>
						<td><c:out value="${monitor.getMonitorModel()}"/></td>
						<td><c:out value="${monitor.getDiagonal().getDiagonal()}"/></td>
						<td><form action="FrontController" method="post">
						<input type="hidden" name="command" value="deleteMonitor" />
						<input type="hidden" name="id" value="${monitor.getId()}"/>
						<button type="submit" class="btn btn-success">Удалить</button>
						
						</form></td>
						<td><form action="FrontController" method="post">
						<input type="hidden" name="command" value="goToUpdate" />
						<input type="hidden" name="id" value="${monitor.getId()}"/>
						<button type="submit" class="btn btn-success">Изменить</button>
						
						</form></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
<%-- <table border="Users">
		<tr>
			<td align="center" , bgcolor="#C0C0C0">id</td>
			<td align="center" , bgcolor="#C0C0C0">name</td>
			<td align="center" , bgcolor="#C0C0C0">lastname</td>
		</tr>
		<c:forEach var="user" items="${userlist}">
			<tr>
				<td align="center"><c:out value="${user.userId}" /></td>
				<td align="center"><c:out value="${user.name}" /></td>
				<td align="center"><c:out value="${user.lastname}" /></td>
			</tr>
		</c:forEach>
	</table> --%>
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