public class LeapYearCalculator {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
	System.out.print("Enter a year to see if it is a leap year or not. You will see up to 20 years from your year ");
        int year = input.nextInt();
        int numOfYears = 0;

        while (numOfYears <= 20) {
            if (((year % 4 == 0) && !(year % 100 == 0) || (year % 400 == 0))) {
                System.out.println("The year " + year + " is a leap year.");
            } else {
                System.out.println(year);
            }
            numOfYears = numOfYears + 1;
            year = year + 1;
        }


    }
}

