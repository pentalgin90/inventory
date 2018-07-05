<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
		<c:url var="loginUrl" value="/login" />
		
		<form action="${loginUrl}" method="post">
			<input type="text" id="username" name="name"/>
			<input type="password" id="password" name="pass"/>
			<input type="submit" value="Login"/>
		</form>
		
</body>
</html>