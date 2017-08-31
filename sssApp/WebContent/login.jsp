<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login page</title>
</head>
<body>
	<h2>Login form:</h2>
	<hr width="80%">
	<form action="LoginUser" method="post">
		<label for="email">E-mail:</label>
		<input class="email" type="email" name="email" required="required" placeholder="your.email@domain">
		<br>
		<label for="pass">Password:</label>
		<input class="pass" type="password" name="pass" required="required" placeholder="Your superstrong password">
		<br>
		<input type="submit" name="Register" value="Login">
	</form>
</body>
</html>