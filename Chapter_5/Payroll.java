import java.util.Scanner;

public class Payroll {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter employee number (max 9999): ");
        int employeeNumber = scanner.nextInt();

        System.out.print("Enter pay rate (max 60.00): ");
        double payRate = scanner.nextDouble();

        Employee employee;

        try {
            employee = new Employee(employeeNumber, payRate);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
            return;
        }

        System.out.print("How many hours did you work this week? ");
        double hoursWorked = scanner.nextDouble();

        double regularPay = employee.calculateRegularPay(hoursWorked);
        double overtimePay = employee.calculateOvertimePay(hoursWorked);

        System.out.println("Regular pay is " + regularPay);
        System.out.println("Overtime pay is " + overtimePay);

        scanner.close();
    }
}
