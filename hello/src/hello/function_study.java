package hello;
import java.util.Scanner;
public class function_study {
	public static boolean isPrime(int i)
	{
		boolean isPrime = true;
		for(int k=2;k<Math.sqrt(i);k++)
		{
			if(i % k ==0)
			{
				isPrime = false;
				break;
			}
		}
		return isPrime;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int m = in.nextInt();
		if(m>0)
		{
			if( isPrime(m))
				System.out.println(m+"������");
			else
				System.out.println(m+"��������");
		}
		else
			System.out.println("������������Ǵ���0������");
		
	}

}
