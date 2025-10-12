public class Employee {
    private int employeeNumber;
    private double payRate;
    private static final int MAX_EMPLOYEE_NUMBER = 9999;
    private static final double MAX_PAY_RATE = 60.00;
    private static final double OVERTIME_MULTIPLIER = 1.5;

    public Employee(int employeeNumber, double payRate) {
        if (employeeNumber > MAX_EMPLOYEE_NUMBER) {
            throw new IllegalArgumentException("Employee number cannot exceed " + MAX_EMPLOYEE_NUMBER);
        }
        if (payRate > MAX_PAY_RATE) {
            throw new IllegalArgumentException("Pay rate cannot exceed $" + MAX_PAY_RATE);
        }
        this.employeeNumber = employeeNumber;
        this.payRate = payRate;
    }

    public double calculateRegularPay(double hoursWorked) {
        return Math.min(hoursWorked, 40) * payRate;
    }

    public double calculateOvertimePay(double hoursWorked) {
        if (hoursWorked > 40) {
            double overtimeHours = hoursWorked - 40;
            return overtimeHours * payRate * OVERTIME_MULTIPLIER;
        }
        return 0.0;
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public double getPayRate() {
        return payRate;
    }
}
