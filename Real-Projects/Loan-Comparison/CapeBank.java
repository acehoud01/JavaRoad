public class CapeBank extends Bank {
    public CapeBank() {
        super(15.6, 24);
    }

    public double calculateMonthlyPayment(double loanAmount) {
        // Convert the annual interest rate to a monthly interest rate
        double monthlyInterestRate = (interestRate / 100) / 12;

        // Calculate the number of monthly payments
        int numberOfPayments = loanTerm;

        // Calculate the monthly payment
        double monthlyPayment = (loanAmount * monthlyInterestRate) /
            (1 - Math.pow(1 + monthlyInterestRate, -numberOfPayments));

        return monthlyPayment;
    }
}

