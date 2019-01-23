import java.util.Scanner;



public class First_week_exercise {



	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		Fraction a = new Fraction(in.nextInt(), in.nextInt());

		Fraction b = new Fraction(in.nextInt(),in.nextInt());

		a.print();

		b.print();

		a.plus(b).print();

		a.multiply(b).plus(new Fraction(5,6)).print();

		a.print();

		b.print();

		in.close();

	}



}
class Fraction{
	private int son, mom;
	public Fraction(int a, int b) {
		this.son = a;
		this.mom = b;
	}
	double toDouble() {
		return (double)son/mom;
	}
	Fraction plus(Fraction r) {
		int fenmu = r.mom * this.mom;
		int fenzi = r.son * this.mom + this.son * r.mom;
		Fraction result = new Fraction(fenzi, fenmu);
		return result;
	};
	Fraction multiply(Fraction r) {
		int fenmu = r.mom * this.mom;
		int fenzi = r.son * this.son;
		Fraction result = new Fraction(fenzi, fenmu);
		return result;
	}
	Fraction simplify(int a, int b) {
		int son = a;
		int mom = b;
		int max_gongyueshu;
		if(a>b) {
			while(a%b != 0) {
				b = a%b;
			}
			max_gongyueshu = b;
		}
		else {
			while(b%a != 0) {
				a = b%a;
			}
			max_gongyueshu = a;
		}
		Fraction result = new Fraction(son/max_gongyueshu, mom/max_gongyueshu);
		return result;
	}
	void print() {
		if(son == mom)
			System.out.println(1);
		else {
			Fraction result = simplify(son, mom);
			System.out.print(result.son);
			System.out.print('/');
			System.out.println(result.mom);
		}
			
		
	}
}