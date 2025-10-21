import java.util.Scanner;

public class BankBalance {
    public static void main(String[] args) {
        final double INTEREST_RATE = 0.03;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter initial bank balance > ");
        double balance = input.nextDouble();

        int year = 1;
        int choice;

        System.out.println("Do you want to see next year's balance?");
        System.out.print("Enter 1 for yes or any other number for no >> ");
        choice = input.nextInt();

        while (choice == 1) {
            balance = balance + (balance * INTEREST_RATE);
            System.out.println("After year " + year + " at 0.03 interest rate, balance is $" + balance);
            year++;

            System.out.println("\nDo you want to see the balance at the end of another year?");
            System.out.print("Enter 1 for yes or any other number for no >> ");
            choice = input.nextInt();
        }

        input.close();
    }
}
