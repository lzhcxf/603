package com.fortune.v603.dao;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

import com.fortune.v603.domain.User;

public class UserDao {
	public User findMessage(String path){
		Properties props = new Properties();
		try {
			props.load(new FileInputStream("src/" + path + ".properties"));
		} catch (IOException e) {
			System.out.println("异常！系统没有初始化该人的信息。你可以马上修改信息完成初始化！或者联系管理员。");
		}
		User user = new User();
		user.setAge(props.getProperty("age"));
		user.setDes(props.getProperty("des"));
		user.setName(props.getProperty("username"));
		return user;
	}
	
	public void modify(String path){
		Properties props = new Properties();
		try {
			props.load(new FileInputStream("src/" + path + ".properties"));
		} catch (IOException e) {
			System.out.println("系统没有初始化该人的信息，现在开始初始化...");
			
		}
		Scanner s = new Scanner(System.in);
		System.out.println("用户名：" );
		props.setProperty("username", s.nextLine());
		System.out.println("年龄：" );
		props.setProperty("age", s.nextLine());
		System.out.println("信息：" );
		props.setProperty("des", s.nextLine());
		try {
			props.store(new FileOutputStream("src/" + path + ".properties"), "");
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("修改完成！");
	}
}
