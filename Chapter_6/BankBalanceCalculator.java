import java.util.Scanner;

public class BankBalanceCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double balance = 100.00; // Starting balance
        double interestRate = 0.03; // 3% annual interest
        int year = 1;
        int userChoice;

        do {
            // Apply interest
            balance += balance * interestRate;

            // Display balance
            System.out.printf("After year %d at %.2f interest rate, balance is $%.2f%n",
                              year, interestRate, balance);

            // Ask user if they want to continue
            System.out.println("\nDo you want to see the balance at the end of another year?");
            System.out.print("Enter 1 for yes or any other number for no >> ");
            userChoice = input.nextInt();

            year++;
        } while (userChoice == 1);

        System.out.println("\nThank you for using the Bank Balance Calculator!");
    }
}
