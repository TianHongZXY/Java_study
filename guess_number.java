package hello;

import java.util.Scanner;

public class guess_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int number = (int)(Math.random() * 100 + 1);
		int count = 0;
		int g;
		do
		{
			g = in.nextInt();
			count += 1;
			if( g>number)
				System.out.println("ƫ��");
			else if( g<number)
				System.out.println("ƫС");
		}while(g!=number);
		System.out.println("��ϲ��¶��ˣ������"+count+"��");
	}

}
