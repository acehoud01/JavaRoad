public class Bank {
    protected double interestRate;
    protected int loanTerm;

    public Bank(double interestRate, int loanTerm) {
        this.interestRate = interestRate;
        this.loanTerm = loanTerm;
    }

    public double calculateMonthlyPayment(double loanAmount) {
    // Convert the annual interest rate to a monthly interest rate
    double monthlyInterestRate = (interestRate / 100) / 12;

    // Calculate the number of monthly payments
    int numberOfPayments = loanTerm * 12;

    // Calculate the monthly payment
    double monthlyPayment = (loanAmount * monthlyInterestRate) /
        (1 - Math.pow(1 + monthlyInterestRate, -numberOfPayments));

    return monthlyPayment;
}
 
    public int getLoanTerm() {
        return loanTerm;
    }
}

