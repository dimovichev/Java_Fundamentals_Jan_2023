package BS_CS_Loops_Exercise;

import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // въвеждаме число от конзолата
        int number = Integer.parseInt(scanner.nextLine());
        // запазваме първоначално въведеното число
        int startNum = number;

        int sumFact = 0;
        // взимаме последната цифра на числото
        while (number > 0) {
            int lastDigit = number % 10;
        // намираме факториела на числото
            int fact = 1;
            for (int i = 1; i <= lastDigit; i++) {
                fact = fact * i;
            }
            sumFact += fact;
            number = number / 10;
        }
        if (sumFact == startNum) {
            System.out.println("yes");
        } else {
           System.out.println("no");
}
    }
}
