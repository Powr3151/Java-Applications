import java.util.Scanner;

public class GrossPayCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int employeeCount = 3;  // number of employees

        for (int i = 1; i <= employeeCount; i++) {
            System.out.printf("%nEnter details for Employee %d:%n", i);

            System.out.print("Enter hours worked: ");
            double hours = input.nextDouble();

            System.out.print("Enter hourly rate: ");
            double rate = input.nextDouble();

            double grossPay;

            if (hours <= 40) {
                grossPay = hours * rate;
            } else {
                double overtimeHours = hours - 40;
                grossPay = (40 * rate) + (overtimeHours * rate * 1.5);
            }

            System.out.printf("Employee %d gross pay: $%.2f%n", i, grossPay);
        }

        input.close();
    }
}
