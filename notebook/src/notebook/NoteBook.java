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
//		for(String s : notes) { // arraylist也可以用 for each循环
//			System.out.println(s);
//		}
		notes.toArray(a);
		return a;
	}
	
	public static void main(String[] args) {
//		Value[] a = new Value[10];
//		for(int i=0;i<a.length;i++) {
//			System.out.println(a[i]);// 创建的a为对象数组，每个a[i]只是对象的管理者而非对象本身，
//										  所以在未new出新对象时为null
//			a[i] = new Value();
//			System.out.println(a[i]);// a[i]的内容其实是对象的地址
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
		System.out.println(nb); // nb并不是一个arraylist类，不然可以直接输出存储的内容而非地址。
		
		HashSet<String> s = new HashSet<String>();
		s.add("first");
		s.add("second");
		s.add("first");
		System.out.println(s);
		
	}

}
