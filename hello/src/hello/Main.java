package hello;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//		初始化
		int balance = 0;
		while(true) {
			Scanner in = new Scanner(System.in);
			//		读入投币金额
			System.out.print("请投币：");
			int amount = in.nextInt();
			balance = balance + amount;
			if (balance >= 10)
				{
				//		打印车票
				System.out.println("******************");
				System.out.println("* Java城际铁路专线 *");
				System.out.println("*   票价：10元        *");
				System.out.println("******************");
				//		计算并打印找零
				System.out.println("找零：" + (balance-10));
				balance = 0;
				}
		}
	}

}
