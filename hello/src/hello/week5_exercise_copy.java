package hello;
import java.util.Scanner;
// ѧϰ���飺��ÿһ���ж�ģ�黯����ˮ�߻�������ʡ�Դ����ظ�����
// ������ͨ��ǡ�AxN������ֻ��Ҫ����4���ּ��ɡ�
// ���ڷ��ţ�Ҫ����д��д��д+����-������ϵ����Ҫ���ǲ�д1������x��0�εĲ�д������N��N=1��0��д��
public class week5_exercise_copy {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner in = new Scanner(System.in);
			int a=in.nextInt();
			int[] powers=new int[a+1];
			int max=a;//��ߴ���
			int b;
			int zero=0;
			while(a>=0&&a<=100) {
				if(a==0) {
					//��һ��0��ֻ��Ҫ��¼һ��
					if(zero==0) {
						zero++;
					}else {
						//�ڶ���0����¼��bȻ����˳�����
						b=in.nextInt();
						powers[a]+=b;
						break;
					}
				}
				b=in.nextInt();
				powers[a]+=b;//ϵ������
				a=in.nextInt();				
			}
			//���濪ʼ׼�����
			boolean isFirst=true;//�Ƿ��ǵ�һ��������й��ڷ���
			//i�ǽ���
			for(int i=max;i>=0;i--)
			{
				//�����ߴ�����0,��ôֱ�����������Ȼ������ѭ��
				if(max==0) {
					System.out.println(powers[0]);
					break;
				}
				//0ϵ�����Ҫ�����ֱ����һ��ѭ��
				if(powers[i]==0) {
					continue;
				}
				
				//���������ŵ�����
				//��0ϵ�����һ�����ʱ���ÿ��Ƿ���
				if(isFirst) {
					isFirst=false;
				}
				//��Ϊ��һ�����
				else if(powers[i]>0) {
					//��ϵ��Ҫ�мӺ�
					System.out.print("+");
				}
				
				//����ϵ��������
				//��1��ϵ����Ҫ���
				if(powers[i]!=1) {
					System.out.print(powers[i]);
				}
				
				//����X������
				//��0����Ҫ���
				if(i!=0) {
					System.out.print("x");
				}
				
				//���ڽ���������
				//���ڵ���2��Ҫ�������
				if(i>=2) {
					System.out.print(i);
				}
					
			}
 
	
	
	
	
	
	}
}
