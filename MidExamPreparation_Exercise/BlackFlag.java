package MidExamPreparation_Exercise;

import java.util.Scanner;

public class BlackFlag {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      int daysInSea = Integer.parseInt(scanner.nextLine());
      int plunderForDay = Integer.parseInt(scanner.nextLine());
      double expectedPlunder = Double.parseDouble(scanner.nextLine());
      double countPlunder = 0;

      for (int days = 1; days <= daysInSea; days++) {

         countPlunder += plunderForDay;

         if (days % 3 == 0) {
            countPlunder += plunderForDay * 0.5;
         }
         if (days % 5 == 0) {
            countPlunder -= countPlunder * 0.3;
         }
      }
      if (countPlunder >= expectedPlunder) {
         System.out.printf("Ahoy! %.2f plunder gained.", countPlunder);
      } else if (countPlunder < expectedPlunder) {
         System.out.printf("Collected only %.2f%% of the plunder.", countPlunder / expectedPlunder * 100);
      }
   }
}
