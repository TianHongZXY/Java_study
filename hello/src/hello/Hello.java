package hello;

import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello, World");
		Scanner in = new Scanner(System.in);
//		System.out.print("请输入票面：");  // print末尾不换行 println末尾换行
//		System.out.print("100");
//		System.out.println("请输入票面");
//		System.out.println("100");
//		System.out.println("echo:" + in.nextLine());
		int price;
		int amount;
		System.out.print("请输入票面：");
		amount = in.nextInt();
		System.out.print("请输入金额：");
		price = in.nextInt();
		System.out.println(amount + "-" + price + "=" + (amount - price));
	}

}
