package hello;
import java.util.Scanner;
public class week6_exercise1 {
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
		boolean nothing = true;
		for(int i=0;i<s.length();i++)
			
		{	// ������ǿո�
			if((s.charAt(i)+"").equals(" ") == false && (s.charAt(i)+"").equals(".")==false)
			{	
				// ���ʳ���+1
				length += 1;
				nothing = false;
			}
			// �����ĩβ����ӡ��break
			if((s.charAt(i)+"").equals("."))
			{	
				if(nothing==false) {
					System.out.print(length);
					break;
				}
				else
					break;
				
			}
			// ����ǿո�
			if((s.charAt(i)+"").equals(" "))
			{
				if(length!=0 && nothing==false)
				{
					System.out.print(length+" ");
					length = 0;
					nothing = true;
				}
					
					
			}
			
			
		}
	}

}
