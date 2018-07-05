<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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

<div class="jumbotron text-center" style="background-color:LimeGreen;">
  <h1>Список технике</h1>
  <p>Можно посмотреть всю технику, а так же удалить или изменить</p> 
</div>

<div class="row">
	<div class="col"><!-- <form action="FrontController" method="get">
			<input type="hidden" name="command" value="allMonitors" /> 
			<button type="submit" class="btn btn-success">Мониторы</button>
	</form> -->
	<form action="allMonitors" method="get">
			<button type="submit" class="btn btn-success">Мониторы</button>
	</form>
	</div>
	<div class="col"><form action="FrontController" method="get">
			<input type="hidden" name="command" value="allCommutator" /> 
			<button type="submit" class="btn btn-success">Коммутатор</button>
	</form>
	</div>
	<div class="col"><form action="FrontController" method="get">
			<input type="hidden" name="command" value="allPrinter" /> 
			<button type="submit" class="btn btn-success">Принтеры</button>
	</form>
	</div>
</div>
<div class="row">
	<div class="col"><form action="FrontController" method="get">
			<input type="hidden" name="command" value="allComputers" /> 
			<button type="submit" class="btn btn-success">Компьютеры</button>
	</form>
	</div>
	<div class="col"><form action="FrontController" method="get">
			<input type="hidden" name="command" value="allLaptop" /> 
			<button type="submit" class="btn btn-success">Ноутбуки</button>
	</form>
	</div>
</div>
<div class="row">
	<div class="col"><form action="FrontController" method="get">
			<input type="hidden" name="command" value="allServer" /> 
			<button type="submit" class="btn btn-success">Сервер</button>
	</form>
	</div>
	<div class="col"><form action="FrontController" method="get">
			<input type="hidden" name="command" value="allTelephone" /> 
			<button type="submit" class="btn btn-success">Телефоны</button>
	</form>
	</div>
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