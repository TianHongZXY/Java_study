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
		// next读入一个单词，以空格为分隔
		// nextline读入一整行
//		input = in.nextLine();
//		System.out.println(input);
//		// equals判断字符串内容一致
//		System.out.println(input.equals("bye"));
//		System.out.println(input.length());
		System.out.println(t.charAt(0));
//		for(int i=0;i<t.length();i++)
//			System.out.println(t.charAt(i));
		String num = "this is a test.";
		// 从第4个字符到最后
		System.out.println(num.substring(5));
		// 从第3个字符到第7个，不包括末尾
		System.out.println(num.substring(2, 7));
		// 寻找字符,返回找到的第一个位置的索引
		System.out.println(num.indexOf("i"));
	}

}
