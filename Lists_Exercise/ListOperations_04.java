package Lists_Exercise;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine()
                        .split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String command = scanner.nextLine();
        while (!command.equals("End")) {

            if (command.contains("Add")) {
                int numberToAdd = Integer.parseInt(command.split("\\s+")[1]);
                numbers.add(numberToAdd);

            } else if (command.contains("Insert")) {
                int numberToInsert = Integer.parseInt(command.split("\\s+")[1]);
                int indexToInsert = Integer.parseInt(command.split("\\s+")[2]);

                if (indexToInsert >= 0 && indexToInsert <= numbers.size() - 1) {
                    numbers.add(indexToInsert, numberToInsert);
                } else {
                    System.out.println("Invalid index");
                }

            } else if (command.contains("Remove")) {
                int indexToRemoveFrom = Integer.parseInt(command.split("\\s+")[1]);

                if (indexToRemoveFrom >= 0 && indexToRemoveFrom <= numbers.size() - 1) {
                numbers.remove(indexToRemoveFrom);
                }else {
                    System.out.println("Invalid index");
                }

            } else if (command.contains("Shift left")) {
                int countShiftLeft = Integer.parseInt(command.split("\\s+")[2]);

                for (int time = 1; time <= countShiftLeft; time++) {
                //1.взимам първото число от списъка
                int firstNumber = numbers.get(0);
                //2.премахвам първото число
                numbers.remove(0);
                //3.добавям първото число в края на списъка
                numbers.add(firstNumber);
                }

            } else if (command.contains("Shift right")) {
                int countShiftRight = Integer.parseInt(command.split("\\s+")[2]);

                for (int time = 1; time <= countShiftRight; time++) {
                    //1.взимам последното число от списъка
                    int lastNumber = numbers.get(numbers.size() - 1);
                    //2.премахвам последното число
                    numbers.remove(numbers.size() - 1);
                    //3.добавям последното число в началото на списъка
                    numbers.add(0, lastNumber);
                }
            }
            command = scanner.nextLine();
        }
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}

