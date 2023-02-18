package Lists_Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PokemonDontGo_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine()
                                .split("\\s+"))
                                .map(Integer::parseInt)
                                .collect(Collectors.toList());

        int sum = 0;

        while (numbers.size() > 0) {
            int index = Integer.parseInt(scanner.nextLine());
            if (index < 0) {
                //1.взимам първия и последния елемент
                int firstElement = numbers.get(0);
                int lastElement = numbers.get(numbers.size()-1);
                //2.премествам последния елемент на първо място
                numbers.set(0, lastElement);
                sum += firstElement;
                //3.модифицирам списъка
                modifyList(numbers, firstElement);


            } else if (index > numbers.size()-1) {
                //1. взимам последния елемент
                int lastElement = numbers.get(numbers.size()-1);
                //2. взимам първия елемент
                int firstElement = numbers.get(0);
                //3. поставяме първия елемент на последно място
                numbers.set(numbers.size()-1, firstElement);
                sum += lastElement;
                //4.модифицираме списъка
                modifyList(numbers, lastElement);


            } else if (index >= 0 && index <= numbers.size()-1) {
                //1. взимам елемента на индекса
                int removedNumber = numbers.get(index);
                //2. премахвам елемента на индекса
                numbers.remove(index);
                sum += removedNumber;
                //3. променям списъка според премахнатото число
                modifyList(numbers, removedNumber);
            }
        }
        System.out.println(sum);
    }

    private static void modifyList(List<Integer> numbers, int removedNumber) {
        for (int index = 0; index <= numbers.size()-1; index++) {
            int currentElement = numbers.get(index);
            if (currentElement <= removedNumber) {
                currentElement += removedNumber;
            } else {
                currentElement -= removedNumber;
            }
            numbers.set(index, currentElement);
        }
    }
}
