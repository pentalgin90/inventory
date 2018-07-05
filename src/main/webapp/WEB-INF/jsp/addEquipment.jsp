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


<title>Список техники</title>
</head>
<body>
	<div class="btn-group">
		<form action="goAddMonitor" method="get">
			<button type="submit" class="btn btn-success">Монитор</button>
		</form>
		<form action="goAddCommutator" method="get">
			<button type="submit" class="btn btn-success">Коммутатор</button>
		</form>
		</form>
		<form action="FrontController" method="get">
			<input type="hidden" name="command" value="addCommutator" />
			<button type="submit" class="btn btn-success">Компьютер</button>
		</form>
		</form>
		<form action="FrontController" method="get">
			<input type="hidden" name="command" value="addCommutator" />
			<button type="submit" class="btn btn-success">Док станция</button>
		</form>
		</form>
		<form action="FrontController" method="get">
			<input type="hidden" name="command" value="addCommutator" />
			<button type="submit" class="btn btn-success">Ноутбук</button>
		</form>
		</form>
		<form action="FrontController" method="get">
			<input type="hidden" name="command" value="addCommutator" />
			<button type="submit" class="btn btn-success">Принтер</button>
		</form>
		</form>
		<form action="FrontController" method="get">
			<input type="hidden" name="command" value="addCommutator" />
			<button type="submit" class="btn btn-success">Сервер</button>
		</form>
		</form>
		<form action="FrontController" method="get">
			<input type="hidden" name="command" value="addCommutator" />
			<button type="submit" class="btn btn-success">Терминал</button>
		</form>
		</form>
		<form action="FrontController" method="get">
			<input type="hidden" name="command" value="addCommutator" />
			<button type="submit" class="btn btn-success">Wi-Fi точка</button>
		</form>
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