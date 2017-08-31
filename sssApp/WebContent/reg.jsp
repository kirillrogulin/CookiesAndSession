<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Register here</title>
</head>
<body>
	<h2>Registration form:</h2>
	<hr width="80%">
	<form action="registeruser" method="post">
		<label for="name">Name:</label>
		<input class="name" type="text" name="name" placeholder="Your real name">
		<br>
		<label for="surname">Surname:</label>
		<input class="surname" type="text" name="surname" placeholder="Your real surname">
		<br>
		<label for="email">E-mail:</label>
		<input class="email" type="email" name="email" required="required" placeholder="your.email@domain">
		<br>
		<label for="nickname">Nickname:</label>
		<input class="nickname" type="text" name="nickname" required="required" placeholder="Nickname">
		<br>
		<label for="pass">Password:</label>
		<input class="pass" type="password" name="pass" required="required" placeholder="Your superstrong password">
		<br>
		<input type="submit" name="Register" value="Register">
	</form>
</body>
</html>