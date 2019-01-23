package hello;
import java.util.Scanner;
public class week4_exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int[] primes = new int[201];
		primes[1] = 2;
		int cnt = 1;
		MAIN_LOOP:
		for(int x=3;cnt<primes.length-1;x=x+2)
		{
			for(int i=1;i<cnt;i++)
			{
				if(x % primes[i] == 0)
				{
					continue MAIN_LOOP;
				}
			}
			primes[++cnt] = x;
		}
		int n = in.nextInt();
		int m = in.nextInt();
		int sum=0;
		for(int i=n;i<=m;i++)
			sum += primes[i];
		System.out.println(sum);
	}

}
