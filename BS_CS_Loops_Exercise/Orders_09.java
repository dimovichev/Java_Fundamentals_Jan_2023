package BS_CS_Loops_Exercise;

import java.util.Scanner;

public class Orders_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOrders = Integer.parseInt (scanner.nextLine());
        double totalSum = 0;
        for (int i = 1; i <= numberOrders ; i++) {
            double pricePerCapsule = Double.parseDouble(scanner.nextLine());
            int days = Integer.parseInt(scanner.nextLine());
            int capsulesCount = Integer.parseInt(scanner.nextLine());
            //"The price for the coffee is: ${price}"
            //((daysInMonth * capsulesCount) * pricePerCapsule)
            double coffeePrice = ((days * capsulesCount) * pricePerCapsule);
            totalSum += coffeePrice;
            System.out.printf("The price for the coffee is: $%.2f%n", coffeePrice);
        }
        System.out.printf("Total: $%.2f", totalSum);
    }
}
