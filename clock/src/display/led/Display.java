package display.led;

public class Display {
	// private修饰的类只能在本类中访问，外部类访问不了，但是同一个类中的不同对象却可以访问
	// 比如可以在minute里传入了hour，就可以访问hour.value
	// 因此说private是对类的而不是对对象的
	private int value = 0;
	private int limit = 0;
	// 类变量前关键字为static，它属于类而非对象，类变量只有一份
	// 在一个地方类变量发生了变化，它在所有对象中都发生了变化
	// 类变量可以通过 类.类变量 访问 如 Display.step = 3;
	// 也可以通过对象 如 d1.step = 3; d1是一个Display类的对象
	// static变量的初始化和对象的初始化无关，static变量只会初始化一次
	private static int step = 1;
	// 与类同名的方法叫做构造函数，每次生成一个对象，在初始化所有变量后都会调用它
	public Display(int limit) {
		this.limit = limit;
	}
	
	public void increase() {
		value++;
		if( value == limit) {
			value = 0;
		}
	}
	// 如果没有public 那么这个成员函数只能被处于同一个package下的文件访问
	public int getValue() {
		return this.value;
	}
	public static void Main() {
		System.out.println("Hello, world!");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Display.step);
		Display.step = 2;
		System.out.println(Display.step);
		Main();
	}

}




