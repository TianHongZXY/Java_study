package hello;

import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello, World");
		Scanner in = new Scanner(System.in);
//		System.out.print("������Ʊ�棺");  // printĩβ������ printlnĩβ����
//		System.out.print("100");
//		System.out.println("������Ʊ��");
//		System.out.println("100");
//		System.out.println("echo:" + in.nextLine());
		int price;
		int amount;
		System.out.print("������Ʊ�棺");
		amount = in.nextInt();
		System.out.print("�������");
		price = in.nextInt();
		System.out.println(amount + "-" + price + "=" + (amount - price));
	}

}
