class Movie {
	String title;
	String genre;
	int rating;

	void playIt() {
		System.out.println("Playing the movies");
	}
}

public class MovieTestDrive {
	public static void main(String[] args) {
		Movie one = new Movie();
		one.title = "Gone with the stock";
		one.genre = "Tragic";
		one.rating = -2;

		Movie two = new Movie();
		two.title = "Run Jozi";
		two.genre = "Action";
		two.rating = 5;
		two.playIt();
	}
}
