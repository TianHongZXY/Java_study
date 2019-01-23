package dome;

import java.util.ArrayList;

public class Database {
//	private ArrayList<CD> listCD = new ArrayList<CD>();
//	private ArrayList<DVD> listDVD = new ArrayList<DVD>();
	
	private ArrayList<Item> listItem = new ArrayList<Item>();
	
//	public void add(CD cd) {
//		listCD.add(cd);
//	}
//	
//	public void list() {
//		for(CD cd : listCD)
//			cd.print();
//	}
	
	public void add(Item item) {
		listItem.add(item);
	}
	
	private void list() {
		for(Item item : listItem) {
			item.print();
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Database db = new Database();
		db.add(new CD("abc", "zxy", 4, 99, "great"));
		db.add(new CD("def", "cd", 2, 66, "very good"));
		db.add(new VideoGame("worldcraft", 30, false, "great", 2));
		db.list();
	}

	

}
