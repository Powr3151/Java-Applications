import java.util.Scanner;

public class WorldPopulationProjection {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter current world population (in billions, e.g., 8.2): ");
        double popBillions = input.nextDouble();
        System.out.print("Enter annual growth rate (percentage, e.g., 0.9 for 0.9%): ");
        double ratePercent = input.nextDouble();

        double initialPopulation = popBillions * 1_000_000_000.0;
        double growthRate = ratePercent / 100.0;

        System.out.printf("%n%-5s %-20s %-20s%n", "Year", "Population", "Increase");
        System.out.println("-----------------------------------------------------");

        double currentPopulation = initialPopulation;
        int doublingYear = -1;
        double target = initialPopulation * 2;

        for (int year = 1; year <= 75; year++) {
            double newPopulation = currentPopulation * (1 + growthRate);
            double increase = newPopulation - currentPopulation;

            System.out.printf("%4d %20.0f %20.0f%n", year, newPopulation, increase);

            if (doublingYear == -1 && newPopulation >= target) {
                doublingYear = year;
            }
            currentPopulation = newPopulation;
        }

        if (doublingYear != -1) {
            System.out.printf("%nUnder the constant growth rate assumption, the world population would double by year: %d%n", doublingYear);
        } else {
            System.out.printf("%nUnder the constant growth rate assumption, the world population would *not* double within the next 75 years.%n");
        }

        input.close();
    }
}
