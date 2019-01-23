package notebook;

//import java.util.ArrayList;
import java.util.*;
class Value{
	private int i;
	public void set(int i) {this.i = i;}
	public int get() {return i;}
	public String toString(){return ""+i;}
}
public class NoteBook {
	
	
	private ArrayList<String> notes = new ArrayList<String>();
	
	public void add(String s) {
		notes.add(s);
	}
	public void add(String s, int location) {
		notes.add(location, s);
	}
	public int getSize() {
		return notes.size();
	}
	
	public String getNote(int index) {
		return notes.get(index);
	}
	
	public void removeNote(int index) {
		notes.remove(index);
	}
	
	public String[] list() {
		String[] a = new String[notes.size()];
//		for(int i=0;i<notes.size();i++) {
//			a[i] = notes.get(i);
//		}
//		for(String s : notes) { // arraylistҲ������ for eachѭ��
//			System.out.println(s);
//		}
		notes.toArray(a);
		return a;
	}
	
	public static void main(String[] args) {
//		Value[] a = new Value[10];
//		for(int i=0;i<a.length;i++) {
//			System.out.println(a[i]);// ������aΪ�������飬ÿ��a[i]ֻ�Ƕ���Ĺ����߶��Ƕ�����
//										  ������δnew���¶���ʱΪnull
//			a[i] = new Value();
//			System.out.println(a[i]);// a[i]��������ʵ�Ƕ���ĵ�ַ
//			a[i].set(i);
//		}
//		for(Value v : a) {
//			System.out.println(v.get());
//		}
		NoteBook nb = new NoteBook();
		nb.add("first");
		nb.add("second");
		nb.add("third", 0);
		System.out.println(nb.getSize());
		System.out.println(nb.getNote(0));
		nb.removeNote(1);
//		String[] a = nb.list();
//		for(String s : a) {
//			System.out.println(s);
//		}
		System.out.println(nb); // nb������һ��arraylist�࣬��Ȼ����ֱ������洢�����ݶ��ǵ�ַ��
		
		HashSet<String> s = new HashSet<String>();
		s.add("first");
		s.add("second");
		s.add("first");
		System.out.println(s);
		
	}

}
