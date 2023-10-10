class UninitializedFields {
	//uninitialized instance variables
	byte one; 
	short two;
	int three;
	float four;
	long five;
	double six;
	char seven;
	boolean eight;

	public static void main(String[] args) {
		UninitializedFields test = new UninitializedFields();

		System.out.println(test.one);
		System.out.println(test.two);
		System.out.println(test.three);
                System.out.println(test.four);
		System.out.println(test.five);
                System.out.println(test.six);
                System.out.println(test.seven);
		System.out.println(test.eight);
	}
}
