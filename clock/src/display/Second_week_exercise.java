package display;
import java.util.Scanner;
public class Second_week_exercise {

// 分隔问题，模块化，
// 1.不是空格单词长度就+1
// 2.是末尾就打印单词长度-1（去掉了末尾"."的长度）
// 3.是空格，若单词长度不为0（防止多个0重复），则打印单词长度，不然不操作
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		int length = 0;
		for(int i=0;i<s.length();i++)
			
		{	// 如果不是空格
			if((s.charAt(i)+"").equals(" ") == false)
			{	
				// 单词长度+1
				length += 1;
			}
			// 如果是末尾，打印后break
			if((s.charAt(i)+"").equals("."))
			{
				System.out.print(length-1);
				break;
			}
			// 如果是空格
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
