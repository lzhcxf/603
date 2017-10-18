package com.fortune.v603.web;

import java.util.Scanner;

import com.fortune.v603.dao.Session;
import com.fortune.v603.utils.Login;

public class LoginView {
	public void loginView(){
		System.out.println("\n\n\n\n\n\n\n");
		System.out.println("\t\t\t\t\t\t===============================");
		System.out.println("\t\t\t\t\t\t===============================");
		System.out.println("\t\t\t\t\t\t===========欢迎来到603===========");
		System.out.println("\t\t\t\t\t\t===============================");
		System.out.println("\t\t\t\t\t\t===============================");
		System.out.println("\n\n\n\n\n\n\n");
	}
	
	static HomeView hv = new HomeView();

	public static void login() {
		while (true) {
			System.out.println("请输入用户名：");
			Scanner s = new Scanner(System.in);
			String username = s.nextLine();
			System.out.println("请输入密码：");
			String password = s.nextLine();
			if (Login.password(username, password)) {
				Session.setUname(username);
				// 主界面
				System.out.println("主界面");
				hv.homeView();
				while(Session.getUname() != null)
					hv.homeView();
//				break;
			} else {
				System.out.println("密码或用户名错误。");
				System.out.println("是否继续？Y/N");
				String flag = s.nextLine();
				if(flag.equalsIgnoreCase("N")){
					break;
				}
			}
		}
	}
	
	public static void main(String[] args) {
	}
}
