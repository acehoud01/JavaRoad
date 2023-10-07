class DrumKit {
	boolean topHat = true;
	boolean snare = true;

	void playSnare() {
		System.out.println("bang bang ba-bang");
	}

	void playTopHat() {
		System.out.println("ding ding da-ding");
	}
}
public class DrumKitTestDrive {
	public static void main(String[] args) {
		/* A Java program is all scrambled up on
		the fridge. Can you reconstruct the
		code snippets to make a working Java
		program that produces the output listed
		below? Some of the curly braces fell on
		the floor and they were too small to pick
		up, so feel free to add as many of those
		as you need.

		expected output: bang bang ba-bang
				 ding ding da-ding
		*/

		DrumKit d = new DrumKit();
		

		if (d.snare == true) {
			d.playSnare();
		}
		d.snare = false;
		d.playTopHat();
	}
}
