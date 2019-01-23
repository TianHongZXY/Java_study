package hello;
import java.util.Scanner;
public class week4_exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		
		if(num<0)
		{
			System.out.print("fu ");
			num = -num;
		}
		int size = 0;
		int n = num;
		while(n!=0)
		{
			n /= 10;
			size++;
		}
		if(size==0)
			size = 1;
		//System.out.println(size);
		int[] k = new int[size];
		for(int i=size;i>=1;i--)
		{
			k[size-i] = (num / (int)Math.pow(10, i-1));
			num -= k[size-i] * Math.pow(10, i-1);
		}
		for(int i=0;i<k.length-1;i++)
		{
			switch(k[i])
			{
			case 0:
			{
				System.out.print("ling ");
				break;
			}
			case 1:
			{
				System.out.print("yi ");
				break;
			}
			case 2:
			{
				System.out.print("er ");
				break;
			}
			case 3:
			{
				System.out.print("san ");
				break;
			}
			case 4:
			{
				System.out.print("si ");
				break;
			}
			case 5:
			{
				System.out.print("wu ");
				break;
			}
			case 6:
			{
				System.out.print("liu ");
				break;
			}
			case 7:
			{
				System.out.print("qi ");
				break;
			}
			case 8:
			{
				System.out.print("ba ");
				break;
			}
			case 9:
			{
				System.out.print("jiu ");
				break;
			}
			}
		}
		switch(k[k.length-1])
		{
		case 0:
		{
			System.out.print("ling");
			break;
		}
		case 1:
		{
			System.out.print("yi");
			break;
		}
		case 2:
		{
			System.out.print("er");
			break;
		}
		case 3:
		{
			System.out.print("san");
			break;
		}
		case 4:
		{
			System.out.print("si");
			break;
		}
		case 5:
		{
			System.out.print("wu");
			break;
		}
		case 6:
		{
			System.out.print("liu");
			break;
		}
		case 7:
		{
			System.out.print("qi");
			break;
		}
		case 8:
		{
			System.out.print("ba");
			break;
		}
		case 9:
		{
			System.out.print("jiu");
			break;
		}
		}
			//System.out.print(k[i]+" ");
	}

}
