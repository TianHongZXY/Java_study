package display.led;

public class Display {
	// private���ε���ֻ���ڱ����з��ʣ��ⲿ����ʲ��ˣ�����ͬһ�����еĲ�ͬ����ȴ���Է���
	// ���������minute�ﴫ����hour���Ϳ��Է���hour.value
	// ���˵private�Ƕ���Ķ����ǶԶ����
	private int value = 0;
	private int limit = 0;
	// �����ǰ�ؼ���Ϊstatic������������Ƕ��������ֻ��һ��
	// ��һ���ط�����������˱仯���������ж����ж������˱仯
	// ���������ͨ�� ��.����� ���� �� Display.step = 3;
	// Ҳ����ͨ������ �� d1.step = 3; d1��һ��Display��Ķ���
	// static�����ĳ�ʼ���Ͷ���ĳ�ʼ���޹أ�static����ֻ���ʼ��һ��
	private static int step = 1;
	// ����ͬ���ķ����������캯����ÿ������һ�������ڳ�ʼ�����б����󶼻������
	public Display(int limit) {
		this.limit = limit;
	}
	
	public void increase() {
		value++;
		if( value == limit) {
			value = 0;
		}
	}
	// ���û��public ��ô�����Ա����ֻ�ܱ�����ͬһ��package�µ��ļ�����
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




