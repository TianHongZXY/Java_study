package hello;
import java.util.Scanner;
public class create_primes_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����һ������Ҫ�ĳ��ȵ������б�
//		Scanner in = new Scanner(System.in);
//		int num = in.nextInt();
//		int[] primes = new int[num];
//		primes[0] = 2;
//		int cnt = 1;
//		MAIN_LOOP:
//		for(int x=3;cnt<primes.length;x=x+2)
//		{
//			for(int i=0;i<cnt;i++)
//			{
//				if(x % primes[i] == 0)
//				{
//					continue MAIN_LOOP;
//				}
//			}
//			primes[cnt++] = x;
//		}
//		for(int i=0;i<cnt;i++)
//		{
//			System.out.print(primes[i]+" ");
//		}
		
		//����һ���ж������С��100�������ǲ���������boolean�б�,true������,false��������
		boolean[] isPrime = new boolean[100];
		for(int i=0;i<isPrime.length;i++)
			isPrime[i] = true;
		for(int i=2;i<isPrime.length;i++)
		{
			if(isPrime[i])
			{
				for(int k=i;i*k<isPrime.length;k++)
				{
					isPrime[i*k] = false;
				}
			}
		}
		for(int i=2;i<isPrime.length;i++)
		{
			if(isPrime[i])
				System.out.print(i+" ");
		}
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		System.out.println(isPrime[number]);
	}

}
