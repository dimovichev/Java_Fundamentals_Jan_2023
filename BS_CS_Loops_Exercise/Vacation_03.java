package BS_CS_Loops_Exercise;

import java.util.Scanner;

public class Vacation_03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int groupSize = Integer.parseInt(scanner.nextLine());
        String typeOfGroup = scanner.nextLine();
        String dayOfWeek = scanner.nextLine();

        //You are given a group of people, type of the group, on which day of the week they will stay.
        // Based on that information, calculate how much they must pay and print that price on the console.
        // Use the table below. In each cell is the price for a single person.
        // The output should look like that: "Total price: {price}".
        // The price should be formatted to the second decimal point.
        double price = 0;
        double discountPrice = 0;

        if ("Students".equals(typeOfGroup)) {
            switch (dayOfWeek) {
                case "Friday":
                    price = groupSize * 8.45;
                    break;
                case "Saturday":
                    price = groupSize * 9.80;
                    break;
                case "Sunday":
                    price = groupSize * 10.46;
                    break;
            }
            if (groupSize >= 30) {
                discountPrice = price - (price * 0.15);
            } else {
                discountPrice = price;
            }
        } else if ("Business".equals(typeOfGroup)) {
            switch (dayOfWeek) {
                case "Friday":
                    price = groupSize * 10.90;
                    break;
                case "Saturday":
                    price = groupSize * 15.60;
                    break;
                case "Sunday":
                    price = groupSize * 16.00;
                    break;
            }
            if (groupSize >= 100) {
                discountPrice = (price / groupSize) * (groupSize - 10);
            } else {
                discountPrice = price;
            }
        } else if ("Regular".equals(typeOfGroup)) {
            switch (dayOfWeek) {
                case "Friday":
                    price = groupSize * 15.00;
                    break;
                case "Saturday":
                    price = groupSize * 20.00;
                    break;
                case "Sunday":
                    price = groupSize * 22.50;
                    break;
        }
            if (groupSize >= 10 && groupSize <= 20) {
                discountPrice = price - (price * 0.05);
            } else {
                discountPrice = price;
            }
        }
        //There are also discounts based on some conditions:
        //•	Students – if the group is bigger than or equal to 30 people, you should reduce the total price by 15%
        //•	Business – if the group is bigger than or equal to 100 people 10 of them can stay for free.
        //•	Regular – if the group is bigger than or equal to 10 and less than or equal to 20 reduce the total price by 5%
        //You should reduce the prices in that EXACT order.

        System.out.printf("Total price: %.02f", discountPrice);
    }
}
