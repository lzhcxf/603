package com.fortune.v603.web;

import java.util.Random;
import java.util.Scanner;

public class Game {
	public void gees(){
		rule();
		Random rand = new Random();
		int number  = rand.nextInt(101);
		int count = 0;
		Scanner s = new Scanner(System.in);
		while(true){
			int success = 0;
			System.out.println("请输入你心中所想：");
			int thinkNumber = s.nextInt();
			if(thinkNumber > number){
				System.out.println("你猜的数字比系统的数字大");
			} else if (thinkNumber < number){
				System.out.println("你猜的数字比系统的数字小");
			} else if (thinkNumber == number){
				System.out.println("恭喜！您猜对了");
				success = 4;
				
//				break;
			}
			if(success == 4){
				System.out.println("是否继续：Y/N");
				String flag = s.next();
				if(flag.equalsIgnoreCase("N")){
					break;
				}
				count = 0;
			}
			count++;
			if(count>=5){
				System.out.println("您的次数已经用完，您失败了。系统的随机数字是：" + number);
				System.out.println("是否继续：Y/N");
				String flag = s.next();
				if(flag.equalsIgnoreCase("N")){
					break;
				}
				count = 0;
			}
		}
	}
	
	public void rule(){
		System.out.println("游戏：猜数字");
		System.out.println("========游戏规则========");
		System.out.println("由系统随机给出一个数字(0-100)，你有五次机会猜。");
	}
}
