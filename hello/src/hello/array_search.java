package hello;

import java.util.Scanner;

public class array_search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int[] data = {1,321,43,32,21,43,654,87,68,989};
		int loc = -1;
		boolean found = false;
		int x = in.nextInt();
		for(int i=0;i<data.length;i++)
		{
			if(x == data[i])
			{
				loc = i;
				break;
			}
		}
		for (int k : data)
		{
			if(k == x)
			{
				found = true;
			}
		}
		
		if(loc != -1)
			System.out.println(x+"是第"+(loc+1)+"个");
		else
			System.out.println(x+"不存在");
		if(found == true)
			System.out.println(x+"found");
		else
			System.out.println(x+"not found");
	}

}
