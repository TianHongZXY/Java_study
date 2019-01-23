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
	
//  ֻҪ�������ƺͲ�������(������������ν)�븸��(Object)��ȫ��ͬ����û��override������
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
//		cd.print_(); // �����private�����������в��ɼ�
	}
	

}
