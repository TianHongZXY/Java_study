package hello;

import java.util.Scanner;

public class week3_exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int num;
		int o_count=0,j_count=0;
		num = in.nextInt();
		while(num!=-1)
		{
			if(num%2==0)
				o_count += 1;
			else
				j_count += 1;
			num = in.nextInt();
		}
		System.out.print(j_count+" "+o_count);
		
	}

}
