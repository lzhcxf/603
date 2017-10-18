package com.fortune.v603.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Read {
	public static String readPassword(String username){
		Properties props = new Properties();
		try {
			props.load(new FileInputStream("src/users.properties"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return props.getProperty(username);
	}
}
