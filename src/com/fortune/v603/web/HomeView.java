package com.fortune.v603.web;

import java.util.Scanner;

import com.fortune.v603.dao.Session;
import com.fortune.v603.dao.UserDao;

public class HomeView {
	UserDao userDao = new UserDao();
	UserView userView = new UserView();
	GameView gameView = new GameView();
//	LoginView loginView = new LoginView();
	public void homeView(){
		System.out.println(Session.getUname() + " 欢迎来到603");
		System.out.println("1.人员信息");
		System.out.println("2.游戏基地");
		System.out.println("3.读书墙");
		System.out.println("4.切换帐号");
		System.out.println("0.退出");
		Scanner s = new Scanner(System.in);
		System.out.println("请输入要去的地方：");
		String index = s.nextLine();
		select(index);
//		homeView();
	}
	public void select(String index){
		switch(index){
		case "1": userView.userView(userDao.findMessage(Session.getUname()));
			break;
		case "2": gameView.gameView();
//			System.out.println("此功能的开发工作，欢迎您！");
			
			break;
		case "3": System.out.println("此功能的开发工作，欢迎您！联系管理员：QQ：1787597051");
			break;
		case "4": 
			LoginView.login();
//			System.out.println("此功能的开发工作，欢迎您！");
			break;
		case "0": System.out.println("谢谢使用本系统：" + Session.getUname()); System.exit(0);
			break;
		default:
			System.out.println("由于您的操作不合理，您已经退出系统。");
		}
	}
	
}
