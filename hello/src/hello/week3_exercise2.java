package hello;

import java.util.Scanner;

public class week3_exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int num;
		int last_num;
		int shuwei = 0;
		int result = 0;
		num = in.nextInt();
		if(num>=0 && num<=1000000)
		{	This: // break 可以直接打破标注处的循环
			while(num!=0)
			{
				shuwei += 1;
				last_num = num%10;
				if(shuwei%2==0 && last_num%2==0)
					last_num = 1;
				else if(shuwei%2!=0 && last_num%2!=0)
					last_num = 1;
				else
					last_num = 0;
				
				num /= 10;
				if(shuwei==1 && last_num==0)
					continue;
				result = result + (int)Math.pow(2*last_num, shuwei-1);
				break This;
			}
			System.out.print(result);
		}
	}

}
