<%@page import="com.servlet.CookieParser"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Your profile</title>
</head>
<body>
	<%
		String name = "";
		String surname = "";
		String email = "";
		String id = "";
		
		Cookie cookie = null;
		Cookie[] cs = request.getCookies();
		if(cs != null) {
			for(int i = 0; i < cs.length; i++) {
				if(cs[i].getName().equals("UserInfo")) cookie = cs[i];
			}
		}
		
		if(cookie == null) {
			request.getRequestDispatcher("/sssApp").forward(request, response);
		} else {
			CookieParser cp = new CookieParser();
			name = cp.importCookie(cookie.getValue()).getName();
			surname = cp.getSurname();
			email = cp.getEmail();
			id = cp.getSessionId().subSequence(0, 7).toString();
	%>
			<h2>You have logged in as ${name} ${surname}</h2>
			<p>Your email is: {$email}<br>Your id is: {$id}</p>
			
	<%
		}
	%>
</body>
</html>