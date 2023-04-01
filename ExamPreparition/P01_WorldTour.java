package ExamPreparition;

import java.util.Scanner;

public class P01_WorldTour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder stringBuilder = new StringBuilder();

        String stops = scanner.nextLine();
        stringBuilder.append(stops);

        String comannd = scanner.nextLine();
        while (!comannd.equals("Travel")) {
            if (comannd.startsWith("Add")) {
                String[] parts = comannd.split(":");
                int index = Integer.parseInt(parts[1]);
                if (index >= 0 && index <= stringBuilder.length()-1) {
                    stringBuilder.insert(index, parts[2]);
                }

            } else if (comannd.startsWith("Remove")) {
                String[] parts = comannd.split(":");
                int index1 = Integer.parseInt(parts[1]);
                int index2 = Integer.parseInt(parts[2])+1;
                if (index1 >= 0 && index1 <= stringBuilder.length()-1 && index2 >= 0 && index2 <= stringBuilder.length()) {
                    stringBuilder.delete(index1, index2);
                }

            } else if (comannd.startsWith("Switch")) {
                String[] parts = comannd.split(":");
                String switchBuilder = stringBuilder.toString().replaceAll(parts[1], parts[2]);
                stringBuilder.replace(0, stringBuilder.length(), switchBuilder);
                }
            System.out.println(stringBuilder.toString());

            comannd = scanner.nextLine();
        }
        System.out.println("Ready for world tour! Planned stops: " + stringBuilder.toString());

    }
}
