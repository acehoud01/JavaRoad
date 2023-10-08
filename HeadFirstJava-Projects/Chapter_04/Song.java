public class Song {
	String title;
	String artist;

	void setTitle(String title) {
		this.title = title;
	}

	void setArtist(String artist) {
		this.artist = artist;
	}

	void play() {
		System.out.println("Now playing " + title + " by " + artist);
	}
	
	void next() {
		System.out.println("Next-up " + title + " by " + artist);
	}
			
	public static void main(String[] args) {
		Song song1 = new Song();
		song1.setArtist("Brenda");
		song1.setTitle("Weeked Special");
		Song song2 = new Song();
		song2.setArtist("Travis");
		song2.setTitle("Sing");
		song1.play();
		song2.next();
	}
}		
