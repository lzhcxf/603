package com.fortune.v603.utils;


public class Login {
	
	public static boolean password(String username, String password) {
		String localPassword = Read.readPassword(username);
		if (localPassword == null) {
			return false;
		}
		return localPassword.equals(password);
	}

}
