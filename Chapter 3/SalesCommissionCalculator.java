import java.util.Scanner;

public class SalesCommissionCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double totalSales = 0.0;
        int itemNumber;

        System.out.println("Enter item number (1–4) or 0 to quit:");

        itemNumber = input.nextInt();

        while (itemNumber != 0) {
            switch (itemNumber) {
                case 1:
                    totalSales += 239.99;
                    break;
                case 2:
                    totalSales += 129.75;
                    break;
                case 3:
                    totalSales += 99.95;
                    break;
                case 4:
                    totalSales += 350.89;
                    break;
                default:
                    System.out.println("Invalid item number. Please enter 1–4 or 0 to quit.");
                    break;
            }

            System.out.print("Enter next item number (1–4) or 0 to quit: ");
            itemNumber = input.nextInt();
        }

        double earnings = 200 + (0.09 * totalSales);

        System.out.printf("%nTotal sales: $%.2f%n", totalSales);
        System.out.printf("Earnings for the week: $%.2f%n", earnings);
    }
}
