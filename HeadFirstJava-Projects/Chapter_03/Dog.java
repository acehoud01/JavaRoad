public class Dog {
	String name;

	void bark() {
		System.out.println(name + " says Ruff! Ruff!");
	}

	void eat() {
		System.out.println("huff huff");
	}

	void chaseCat() {
		System.out.println("No do not");
	}

	public static void main(String[] args) {
		Dog dog1 = new Dog();
		dog1.bark();
		dog1.name = "Bart";

		Dog[] myDogs = new Dog[3];
		myDogs[0] = new Dog();
		myDogs[1] = new Dog();
		myDogs[2] = dog1;

		myDogs[0].name = "Fred";
		myDogs[1].name = "Marge";

		System.out.print("last dog's name is ");
		System.out.println(myDogs[2].name);

		for (int i = 0; i < myDogs.length; i++) {
			myDogs[i].bark();
		}
	}
}
