package hello;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//		��ʼ��
		int balance = 0;
		while(true) {
			Scanner in = new Scanner(System.in);
			//		����Ͷ�ҽ��
			System.out.print("��Ͷ�ң�");
			int amount = in.nextInt();
			balance = balance + amount;
			if (balance >= 10)
				{
				//		��ӡ��Ʊ
				System.out.println("******************");
				System.out.println("* Java�Ǽ���·ר�� *");
				System.out.println("*   Ʊ�ۣ�10Ԫ        *");
				System.out.println("******************");
				//		���㲢��ӡ����
				System.out.println("���㣺" + (balance-10));
				balance = 0;
				}
		}
	}

}
