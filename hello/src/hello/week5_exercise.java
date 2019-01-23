package hello;
import java.util.Scanner;

public class week5_exercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		// 二维数组，每一行是一对幂和系数
		int[][] formula1 = new int [101][2];
		int[][] formula2 = new int [101][2];
		
		// cnt1表示第一个多项式的项数，以下同理
		int cnt1 = 0;
		do
			{
				formula1[cnt1][0] = in.nextInt();
				formula1[cnt1][1] = in.nextInt();
				cnt1++;
				
			}while(formula1[cnt1-1][0]!=0);
		
		int cnt2 = 0;
		do
			{
				formula2[cnt2][0] = in.nextInt();
				formula2[cnt2][1] = in.nextInt();
				cnt2++;
				
			}while(formula2[cnt2-1][0]!=0);
		
		// 记录输出结果的二维数组，长度不超过多项式1和2的长度之和
		int[][] result = new int[cnt1+cnt2][2];
		
		// 如果多项式1的幂次更高
		int max_power = Math.max(formula1[0][0], formula2[0][0]);
		int result_cnt = 0;
		int k;
		int j;
		
		// 从大到小遍历所以幂次
		for(int i=max_power;i>=0;i--)
		{	int flag1 = 0;
			int flag2 = 0;
			for(k=0;k<cnt1;k++)
			{
				if(formula1[k][0]==i)
				{
					flag1 = 1;
					break;
				}
				
			}
			for(j=0;j<cnt2;j++)
			{
				if(formula2[j][0]==i)
				{
					flag2 = 1;
					break;
				}
				
			}
			// 将多项式1和2中含有i次幂的记录进result
			if((formula1[k][1]*flag1+formula2[j][1]*flag2!=0) || i==0)
			{
				result[result_cnt][0] = i * Math.max(flag1, flag2);
				result[result_cnt][1] = formula1[k][1]*flag1+formula2[j][1]*flag2;
			}
			// 如果相同幂的系数相加不为0,则result的元素数+1,不然在下一轮将其覆盖,除非是0次幂
			if(result[result_cnt][1]!=0 || i==0)
				result_cnt++;
		}
		// 如果第一项系数绝对值不为1
		if(Math.abs(result[0][1])!=1)
			System.out.print(result[0][1]+"x"+result[0][0]);
		else
			System.out.print("x"+result[0][0]);
		for(int h=1;h<result_cnt-1;h++)
		{	
			// 系数为正打印+,系数为负打印-
			if(result[h][1]>0)
				System.out.print("+");
			else
				System.out.print("-");
			// 如果幂不为1
			if(result[h][0]!=1)
			{
				// 如果系数绝对值不为1
				if(Math.abs(result[h][1])!=1)
					{
						System.out.print(Math.abs(result[h][1])+"x"+result[h][0]);
					}
				// 如果系数绝对值为1
				else
				{
					System.out.print("x"+result[h][0]);
				}
				
				
			}
			// 如果幂为1
			else
			{
				// 如果系数绝对值不为1
				if(Math.abs(result[h][1])!=1)
					{
						System.out.print(Math.abs(result[h][1])+"x");
					}
				// 如果系数绝对值为1
				else
				{
					System.out.print("x"+result[h][0]);
				}
			}
		}
		// 如果0次幂系数大于0或小于0
		if(result[result_cnt-1][1]>0)
			System.out.print("+"+result[result_cnt-1][1]);
		else if(result[result_cnt-1][1]<0)
			System.out.print(result[result_cnt-1][1]);
		// 0次幂系数等于0
		else
			;
	}

}
