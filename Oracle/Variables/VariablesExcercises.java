/*Create a small program that defines some fields. 
Try creating some illegal field names 
and see what kind of error the compiler produces. 
Use the naming rules and conventions as a guide
*/

class VariablesExcerices {
	//legal
	String firstName;
	String lastName;
	int _age;
	double $height;

	//illegal
	String 1name;
	String new;
	String default;

	public static void main(String[] args) {
		VariablesExcerices testing = new VariablesExcerices();

		testing.firstName = "Anele";
		testing.1name = "John";
	}
}
