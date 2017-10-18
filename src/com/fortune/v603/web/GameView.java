package com.fortune.v603.web;

import java.util.Scanner;

import com.fortune.v603.dao.Session;

public class GameView {
	Game game = new Game();
//	HomeView home = new HomeView();
	public void gameView(){
		System.out.println(Session.getUname() + "欢迎来到游戏基地");
		System.out.println("现在游戏基地的游戏有：");
		System.out.println("1.猜数字");
		System.out.println("请输入游戏序号：");
		Scanner s = new Scanner(System.in);
		String number = s.nextLine();
		select(number);
//		home.homeView();
	}

	private void select(String number) {
		switch(number){
		case "1": game.gees();
			break;
		default:
		}
	}
}
