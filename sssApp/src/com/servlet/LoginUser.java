package com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginUser")
public class LoginUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public LoginUser() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Cookie[] cs = request.getCookies();
		Cookie cookie = null;
		if(cs != null) {
			for(int i = 0; i < cs.length; i++) {
				if(cs[i].getName().equals("UserInfo")) {
					cookie = cs[i];
					break;
				}
			}
		}
		if(cookie != null) {
			CookieParser cp = new CookieParser();
			String cookieEmail = cp.importCookie(cookie.getValue()).getEmail();
			String cookiePass = cp.getPass();
			String passedEmail = request.getParameter("email");
			String passedPass = request.getParameter("pass");
			if(cookieEmail.equals(passedEmail) && cookiePass.equals(passedPass)) {
				request.getRequestDispatcher("profile").forward(request, response);
			} else {
				request.getRequestDispatcher("login").forward(request, response);
			}
		}
		
	}

}
