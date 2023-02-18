package Lists_Lab;

import java.util.*;
import java.util.stream.Collectors;

public class RemoveNegativesAndReverse_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                                .map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> positiveNumbres = new ArrayList<>();

        for (int number : numbers) {
            if (number >= 0) {
                positiveNumbres.add(number);
            }
        }
        Collections.reverse(positiveNumbres);
        if (positiveNumbres.size() == 0) {
            System.out.println("empty");

        } else {
            System.out.println(positiveNumbres.toString()
                    .replace("[", "")
                    .replace("]", "")
                    .replaceAll(",", ""));
        }
    }
}
