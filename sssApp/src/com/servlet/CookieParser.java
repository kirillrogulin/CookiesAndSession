package com.servlet;

public class CookieParser {
	private String sesId = "";
	private String name = "";
	private String surname = "";
	private String email = "";
	private String nickname = "";
	private String pass = "";
	
	public CookieParser importCookie(String cVal) {
		String[] params = toString().split("|");
		System.err.println("\n\n" + params.length + "\n\n");
		if(params.length != 6) throw new IllegalArgumentException("Invalid cookie value! Params " + params.length);
		sesId = params[0];
		name = params[1];
		surname = params[2];
		email = params[3];
		nickname = params[4];
		pass = params[5];
		return this;
	}
	
	public String getPass() {
		if(!isInitialized()) throw new NullPointerException("No cookie found!");
		return pass;
	}
	public String getSessionId() {
		if(!isInitialized()) throw new NullPointerException("No cookie found!");
		return sesId;
	}
	public String getName() {
		if(!isInitialized()) throw new NullPointerException("No cookie found!");
		return name;
	}
	public String getSurname() {
		if(!isInitialized()) throw new NullPointerException("No cookie found!");
		return surname;
	}
	public String getEmail() {
		if(!isInitialized()) throw new NullPointerException("No cookie found!");
		return email;
	}
	public String getNickname() {
		if(!isInitialized()) throw new NullPointerException("No cookie found!");
		return nickname;
	}
	
	private boolean isInitialized() {
		return !email.equals("");
	}
}
