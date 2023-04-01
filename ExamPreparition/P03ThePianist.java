package ExamPreparition;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class P03ThePianist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, List<String>> pieces = new LinkedHashMap<>();

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split("\\|");
            pieces.put(input[0], List.of(input[1], input[2]));
        }
        String comannd = scanner.nextLine();
        while (!comannd.equals("Stop")) {
            String[] splitComannd = comannd.split("\\|");
            if (splitComannd[0].equals("Add")) {
                if (pieces.containsKey(splitComannd[1])) {
                    System.out.println(splitComannd[1] + " is already in the collection!");
                } else {
                    pieces.put(splitComannd[1], List.of(splitComannd[2], splitComannd[3]));
                    System.out.printf("%s by %s in %s added to the collection!%n", splitComannd[1], splitComannd[2],splitComannd[3]);
                }
            } else if (splitComannd[0].equals("Remove")) {
                if (!pieces.containsKey(splitComannd[1])) {
                    System.out.printf("Invalid operation! %s does not exist in the collection.%n", splitComannd[1]);
                } else {
                    pieces.remove(splitComannd[1]);
                    System.out.printf("Successfully removed %s!%n", splitComannd[1]);
                }
            } else if (splitComannd[0].equals("ChangeKey")) {
                if (!pieces.containsKey(splitComannd[1])) {
                    System.out.printf("Invalid operation! %s does not exist in the collection.%n", splitComannd[1]);
                } else {
                    String composer = pieces.get(splitComannd[1]).get(0);
                    pieces.put(splitComannd[1], List.of(composer, splitComannd[2]));
                    System.out.printf("Changed the key of %s to %s!%n", splitComannd[1], splitComannd[2]);
                }
            }
            comannd = scanner.nextLine();
        }
        for (Map.Entry<String, List<String>> entry : pieces.entrySet()) {
            System.out.printf("%s -> Composer: %s, Key: %s%n", entry.getKey(), entry.getValue().get(0), entry.getValue().get(1));
        }
    }
}
