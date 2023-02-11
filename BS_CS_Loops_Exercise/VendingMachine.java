package BS_CS_Loops_Exercise;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        double sum = 0;

        while (!command.equals("start")) {
            double inputCoins = Double.parseDouble(command);
            if (inputCoins == 0.1 || inputCoins == 0.2 || inputCoins == 0.5 || inputCoins == 1 || inputCoins == 2) {
                sum = sum + inputCoins;
            } else {
                System.out.printf("Cannot accept %.2f", inputCoins);

            }
            command = scanner.nextLine();
        }

        String product = scanner.nextLine();
        double price = 0;

        while (!product.equals("End")) {

            switch (product) {
                //"Nuts", "Water", "Crisps", "Soda", "Coke" / 2.0, 0.7, 1.5, 0.8, 1.0
                case "Nuts":
                    price = 2.0;
                    break;
                case "Water":
                    price = 0.7;
                    break;
                case "Crisps":
                    price = 1.5;
                    break;
                case "Soda":
                    price = 0.8;
                    break;
                case "Coke":
                    price = 1.0;
                    break;
                default:
                    System.out.println("Invalid product");
            }
            if (sum < price) {
                System.out.println("Sorry, not enough money");
            } else {
                System.out.printf("Purchased %s", product);
                sum -= price;
            }
        }
        System.out.printf("Change: %.2f", sum);
    }
}
