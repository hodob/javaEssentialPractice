package ch04;

public class P_184_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Song mySong = new Song("Nessun Dorma");
		Song yourSong = new Song("���ִ� �� �� �̷��");
		System.out.println(mySong.getTitle());
		System.out.println(yourSong.getTitle());
		
		
	}

}
 class Song {
	 //�ʵ�
	 String title;
	 
	 
	public Song (String a) {
		this.title = a;
	}


	public String getTitle() {
		return title;
	}
}
