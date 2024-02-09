<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Interest of Exercise results</title>
</head>
<body>
<p>${userTimePouch.getExercise() } contains the following: <br />
${userTimePounch.getHours() } hours <br />
${userCoinPounch.getMinutes() } minutes <br />
</p>
<a href="index.jsp">Select another about of time to exercise</a>

</body>
</html>