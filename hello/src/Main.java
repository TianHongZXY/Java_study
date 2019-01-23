import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int sheshi;
		Scanner in = new Scanner(System.in);
		sheshi = in.nextInt();
		System.out.println((int)((sheshi-32)* 5/9));
	}

}
