package hello;

import java.util.Scanner;

public class Compute_average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int num = 0;
		int count = 0;
		int sum = 0;
		num = in.nextInt();
		while(num != -1)
		{
			sum += num;
			count += 1;
			num = in.nextInt();
		}
		if(count != 0)
			System.out.println(sum/(double)count);
		
	}

}
