package hello;

import java.util.Scanner;

public class week2_exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int bjt = 0;
		bjt = in.nextInt();
		int hour,min,output_h,output;
		hour = bjt / 100;
		min = bjt % 100;
		if(hour > 8)
		{
			output_h = hour - 8;
			output = output_h*100 + min;
		}
		else if(hour == 8)
		{
			output = min;
		}
		else
		{
			output_h = hour - 8 + 24;
			output = output_h * 100 + min;
		}
		System.out.println(output);
			
	}

}
