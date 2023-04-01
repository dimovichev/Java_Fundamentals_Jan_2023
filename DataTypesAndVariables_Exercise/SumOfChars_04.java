package DataTypesAndVariables_Exercise;

import java.util.Scanner;

public class SumOfChars_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sumOfChar = 0;

        for (int i = 1; i <= n; i++) {
            char symbol = scanner.nextLine().charAt(0);
            int asciiCode = (int) symbol;
            sumOfChar = sumOfChar + asciiCode;
        }

        System.out.println("The sum equals: " + sumOfChar);
    }
}
