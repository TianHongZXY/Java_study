package display;
import java.util.Scanner;
public class Second_week_exercise {

// �ָ����⣬ģ�黯��
// 1.���ǿո񵥴ʳ��Ⱦ�+1
// 2.��ĩβ�ʹ�ӡ���ʳ���-1��ȥ����ĩβ"."�ĳ��ȣ�
// 3.�ǿո������ʳ��Ȳ�Ϊ0����ֹ���0�ظ��������ӡ���ʳ��ȣ���Ȼ������
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		int length = 0;
		for(int i=0;i<s.length();i++)
			
		{	// ������ǿո�
			if((s.charAt(i)+"").equals(" ") == false)
			{	
				// ���ʳ���+1
				length += 1;
			}
			// �����ĩβ����ӡ��break
			if((s.charAt(i)+"").equals("."))
			{
				System.out.print(length-1);
				break;
			}
			// ����ǿո�
			if((s.charAt(i)+"").equals(" "))
			{
				if(length!=0)
				{
					System.out.print(length+" ");
					length = 0;
				}
					
					
			}
			
			
		}
	}

}
