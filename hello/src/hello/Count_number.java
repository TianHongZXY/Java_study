package hello;

import java.util.Scanner;

public class Count_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		int count = 0;
		do
		{
			number /= 10;
			count += 1;
		}while(number>0);
		
		System.out.println(count);
	}

}
