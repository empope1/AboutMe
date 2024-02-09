<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>About Me</title>
</head>
<body>
	<h1>Let's enter to win with Exercise</h1>
	<h2>We will gather some information</h2>
	<form action="getBioServlet" method="post">
	Enter your Name:
	<input type="text" name="userName" size="10">
	<input type="submit" value="My Name" /><br>
	</form>
	<form action="getInterestServlet" method="post">
	Enter how many hours you spend exercising:
	<input type="text" name="userExercise" size="10">
	<input type="submit" value="My Interests" /><br>
	</form>
</body>
</html>