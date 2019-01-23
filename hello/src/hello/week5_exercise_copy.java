package hello;
import java.util.Scanner;
// 学习经验：把每一次判断模块化，流水线化，可以省略大量重复代码
// 这道题的通项，是±AxN，所以只需要讨论4部分即可。
// 对于符号，要考虑写不写，写+还是-；对于系数，要考虑不写1；对于x，0次的不写；对于N，N=1和0不写。
public class week5_exercise_copy {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner in = new Scanner(System.in);
			int a=in.nextInt();
			int[] powers=new int[a+1];
			int max=a;//最高次幂
			int b;
			int zero=0;
			while(a>=0&&a<=100) {
				if(a==0) {
					//第一个0，只需要记录一下
					if(zero==0) {
						zero++;
					}else {
						//第二个0，记录完b然后就退出输入
						b=in.nextInt();
						powers[a]+=b;
						break;
					}
				}
				b=in.nextInt();
				powers[a]+=b;//系数运算
				a=in.nextInt();				
			}
			//下面开始准备输出
			boolean isFirst=true;//是否是第一个输出，有关于符号
			//i是阶数
			for(int i=max;i>=0;i--)
			{
				//如果最高次幂是0,那么直接输出常数项然后跳出循环
				if(max==0) {
					System.out.println(powers[0]);
					break;
				}
				//0系数项不需要输出，直接下一次循环
				if(powers[i]==0) {
					continue;
				}
				
				//关于正负号的讨论
				//非0系数项，第一次输出时不用考虑符号
				if(isFirst) {
					isFirst=false;
				}
				//不为第一次输出
				else if(powers[i]>0) {
					//正系数要有加号
					System.out.print("+");
				}
				
				//关于系数的讨论
				//非1的系数需要输出
				if(powers[i]!=1) {
					System.out.print(powers[i]);
				}
				
				//关于X的讨论
				//非0阶需要输出
				if(i!=0) {
					System.out.print("x");
				}
				
				//关于阶数的讨论
				//大于等于2阶要输出次数
				if(i>=2) {
					System.out.print(i);
				}
					
			}
 
	
	
	
	
	
	}
}
