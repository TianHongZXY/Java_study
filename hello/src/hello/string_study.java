package hello;
import java.util.Scanner;
public class string_study {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = new String("hello,i'm fine.");
		System.out.println(s);
		String t = "hello!";
		Scanner in = new Scanner(System.in);
		String input;
		// next����һ�����ʣ��Կո�Ϊ�ָ�
		// nextline����һ����
//		input = in.nextLine();
//		System.out.println(input);
//		// equals�ж��ַ�������һ��
//		System.out.println(input.equals("bye"));
//		System.out.println(input.length());
		System.out.println(t.charAt(0));
//		for(int i=0;i<t.length();i++)
//			System.out.println(t.charAt(i));
		String num = "this is a test.";
		// �ӵ�4���ַ������
		System.out.println(num.substring(5));
		// �ӵ�3���ַ�����7����������ĩβ
		System.out.println(num.substring(2, 7));
		// Ѱ���ַ�,�����ҵ��ĵ�һ��λ�õ�����
		System.out.println(num.indexOf("i"));
	}

}
