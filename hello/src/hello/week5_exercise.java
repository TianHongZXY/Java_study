package hello;
import java.util.Scanner;

public class week5_exercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		// ��ά���飬ÿһ����һ���ݺ�ϵ��
		int[][] formula1 = new int [101][2];
		int[][] formula2 = new int [101][2];
		
		// cnt1��ʾ��һ������ʽ������������ͬ��
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
		
		// ��¼�������Ķ�ά���飬���Ȳ���������ʽ1��2�ĳ���֮��
		int[][] result = new int[cnt1+cnt2][2];
		
		// �������ʽ1���ݴθ���
		int max_power = Math.max(formula1[0][0], formula2[0][0]);
		int result_cnt = 0;
		int k;
		int j;
		
		// �Ӵ�С���������ݴ�
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
			// ������ʽ1��2�к���i���ݵļ�¼��result
			if((formula1[k][1]*flag1+formula2[j][1]*flag2!=0) || i==0)
			{
				result[result_cnt][0] = i * Math.max(flag1, flag2);
				result[result_cnt][1] = formula1[k][1]*flag1+formula2[j][1]*flag2;
			}
			// �����ͬ�ݵ�ϵ����Ӳ�Ϊ0,��result��Ԫ����+1,��Ȼ����һ�ֽ��串��,������0����
			if(result[result_cnt][1]!=0 || i==0)
				result_cnt++;
		}
		// �����һ��ϵ������ֵ��Ϊ1
		if(Math.abs(result[0][1])!=1)
			System.out.print(result[0][1]+"x"+result[0][0]);
		else
			System.out.print("x"+result[0][0]);
		for(int h=1;h<result_cnt-1;h++)
		{	
			// ϵ��Ϊ����ӡ+,ϵ��Ϊ����ӡ-
			if(result[h][1]>0)
				System.out.print("+");
			else
				System.out.print("-");
			// ����ݲ�Ϊ1
			if(result[h][0]!=1)
			{
				// ���ϵ������ֵ��Ϊ1
				if(Math.abs(result[h][1])!=1)
					{
						System.out.print(Math.abs(result[h][1])+"x"+result[h][0]);
					}
				// ���ϵ������ֵΪ1
				else
				{
					System.out.print("x"+result[h][0]);
				}
				
				
			}
			// �����Ϊ1
			else
			{
				// ���ϵ������ֵ��Ϊ1
				if(Math.abs(result[h][1])!=1)
					{
						System.out.print(Math.abs(result[h][1])+"x");
					}
				// ���ϵ������ֵΪ1
				else
				{
					System.out.print("x"+result[h][0]);
				}
			}
		}
		// ���0����ϵ������0��С��0
		if(result[result_cnt-1][1]>0)
			System.out.print("+"+result[result_cnt-1][1]);
		else if(result[result_cnt-1][1]<0)
			System.out.print(result[result_cnt-1][1]);
		// 0����ϵ������0
		else
			;
	}

}
