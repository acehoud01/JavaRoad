import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class LoanComparisonApp {
    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("How much would you like to borrow? ");
        double loanAmount = input.nextDouble();

        // Create instances of the banks
        List<Bank> banks = new ArrayList<>();
        banks.add(new CapeBank());
        banks.add(new AgriBank());
        banks.add(new BestLoans());
        banks.add(new LoanShark());
        banks.add(new SABank());

        // Compare monthly payments for each bank and store them in a list
        List<BankWithMonthlyPayment> bankWithMonthlyPayments = new ArrayList<>();
        for (Bank bank : banks) {
            double monthlyPayment = bank.calculateMonthlyPayment(loanAmount);
            bankWithMonthlyPayments.add(new BankWithMonthlyPayment(bank, monthlyPayment));
        }

        // Sort the list of banks by monthly payment in ascending order
        Collections.sort(bankWithMonthlyPayments, new BankComparator());

        // Print the sorted list and recommend the cheapest bank to the client
        System.out.println("Loan Comparison Results (from least expensive to most expensive):");
        for (BankWithMonthlyPayment bankWithPayment : bankWithMonthlyPayments) {
            System.out.println("Bank: " + bankWithPayment.bank.getClass().getSimpleName());
            System.out.println("Monthly Payment: " + bankWithPayment.monthlyPayment);
        }

        // Recommend the cheapest bank to the client
        System.out.println("We recommend you choose " + bankWithMonthlyPayments.get(0).bank.getClass().getSimpleName() + " for the best deal.");
    }

    // Class to store a bank along with its monthly payment
    static class BankWithMonthlyPayment {
        Bank bank;
        double monthlyPayment;

        BankWithMonthlyPayment(Bank bank, double monthlyPayment) {
            this.bank = bank;
            this.monthlyPayment = monthlyPayment;
        }
    }

    // Comparator to sort banks by monthly payment in ascending order
    static class BankComparator implements Comparator<BankWithMonthlyPayment> {
        @Override
        public int compare(BankWithMonthlyPayment bank1, BankWithMonthlyPayment bank2) {
            return Double.compare(bank1.monthlyPayment, bank2.monthlyPayment);
        }
    }
}
