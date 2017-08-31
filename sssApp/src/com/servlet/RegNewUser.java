package com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/registeruser")
public class RegNewUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public RegNewUser() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		StringBuilder sb = new StringBuilder("");
		sb
			.append(request.getSession(true).getId())
			.append("|")
			.append(request.getParameter("name"))
			.append("|")
			.append(request.getParameter("surname"))
			.append("|")
			.append(request.getParameter("email"))
			.append("|")
			.append(request.getParameter("nickname"))
			.append("|")
			.append(request.getParameter("pass"));
		Cookie cookie = new Cookie("UserInfo", sb.toString());
		cookie.setHttpOnly(true);
		cookie.setMaxAge(60);
		cookie.setDomain("localhost");
		response.addCookie(cookie);
		request.getRequestDispatcher("profile").forward(request, response);
	}

}
