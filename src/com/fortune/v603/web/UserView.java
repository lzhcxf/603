package com.fortune.v603.web;

import java.util.Scanner;

import com.fortune.v603.dao.Session;
import com.fortune.v603.dao.UserDao;
import com.fortune.v603.domain.User;

public class UserView {
//	HomeView hv = new HomeView();
	UserDao userDao = new UserDao();
	public void userView(User user){
		System.out.println("用户名：" + user.getName());
		System.out.println("年龄：" + user.getAge());
		System.out.println("信息：" + user.getDes());
		Scanner s = new Scanner(System.in);
		while(true){
			System.out.println("修改信息：m");
			System.out.println("回退：b");
				String flag = s.nextLine();
				if(flag.equalsIgnoreCase("b")){
//					hv.homeView();
					break;
				}
				if(flag.equalsIgnoreCase("m")){
					userDao.modify(Session.getUname());
//					hv.homeView();
	//				break;
				}
		}
	}
}
