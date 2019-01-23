package dome;

public class CD extends Item{
	private String artist;
	private int numofTracks;
	
	public CD(String title, String artist, int numofTracks, int playingTime, String comment) {
		super(title, playingTime, false, comment);
		this.artist = artist;
		this.numofTracks = numofTracks;
//		this.playingTime = playingTime;
//		this.comment = comment;
	}
	public void print() {
		System.out.print("CD:");
		super.print();
		System.out.print(" artist:"+artist);
	}
	
//  只要函数名称和参数数量(参数类型无所谓)与父类(Object)完全相同，有没有override都可以
//	@Override
	public boolean equals(Object obj) {
		CD cc = (CD)obj;
		return artist.equals(cc.artist);
//		return i!=0;
	}
	
	@Override
	public String toString() {
		return "CD [artist=" + artist + ", numofTracks=" + numofTracks + ", toString()=" + super.toString() + "]";
	}
	
	public static void main(String[] args) {
		CD cd = new CD("zxy","love_cj",4,4,"...");
		CD cc = new CD("zxy","love_cj",4,4,"...");
		cd.print();
		System.out.println(cd+"");
		System.out.println(cd.equals(cc));
//		cd.print_(); // 父类的private函数在子类中不可见
	}
	

}
