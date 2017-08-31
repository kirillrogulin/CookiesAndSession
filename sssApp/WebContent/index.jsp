<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Welcome</title>
</head>
<body>
	<%
		response.setContentType("text/html");
		response.setCharacterEncoding("utf-8");
		response.setStatus(200);
		
		Cookie mcookie = null;
		Cookie[] cs = request.getCookies();
		if(cs != null) {
			for(int i = 0; i < cs.length; i++) {
				if(cs[i].getName().equals("UserInfo")) {
					mcookie = cs[i];
					break;
				}
			}
		}
		
		if(mcookie == null) {
	%>
			<p> ${mcookie} </p>
			<a href="register">Registration</a>
			<br>
			<a href="login">Login</a>
	<%
		} else {
			request.getRequestDispatcher("profile").forward(request, response);
		}
	%>
</body>
</html>