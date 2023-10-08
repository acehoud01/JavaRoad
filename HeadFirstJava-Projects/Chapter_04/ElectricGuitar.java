public class ElectricGuitar {
	String brand;
	int numOfPickups;
	boolean rockStarUsesIt;

	public String getBrand(){
		return brand;
	}
	void setBrand(int brand) {
		this.brand = brand;
	}

	public int getNumOfPickups() {
		return numOfPickups;
	}
	void setNumOfPickups(int numOfPickups) {
		this.numOfPickups = numOfPickups;
	}

	public boolean getRockStarUsesIt() {
		return rockStarUsesIt;
	}
	void setRockStarUsesIt(boolean rockStarUsesIt) {
		this.rockStarUsesIt = rockStarUsesIt;
	}

	public static void main(String[] args) {
		ElectricGuitar guitar = new ElectricGuitar();
	}
}
