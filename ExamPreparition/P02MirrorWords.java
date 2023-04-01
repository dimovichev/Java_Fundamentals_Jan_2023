package ExamPreparition;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02MirrorWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        List<String> matchedWords = new ArrayList<>();

        Pattern pattern = Pattern.compile("(@([A-Za-z]{3,})@@([A-Za-z]{3,})@)|(#([A-Za-z]{3,})##([A-Za-z]{3,})#)");
        Matcher matcher = pattern.matcher(text);
        int counter = 0;
        while (matcher.find()){
            counter ++;
            if (matcher.group(1)!= null){
                StringBuilder stringBuilder = new StringBuilder(matcher.group(2));
                if (stringBuilder.reverse().toString().equals(matcher.group(3))) {
                    matchedWords.add(matcher.group(2) + " <=> " + matcher.group(3));
                }
            } else if (matcher.group(4)!= null){
                StringBuilder stringBuilder = new StringBuilder(matcher.group(5));
                if (stringBuilder.reverse().toString().equals(matcher.group(6))) {
                    matchedWords.add(matcher.group(5) + " <=> " + matcher.group(6));
                }
            }

        }
        if (counter == 0) {
            System.out.println("No word pairs found!");
        } else {
            System.out.printf("%d word pairs found!%n", counter);
        }
        if (matchedWords.size() == 0) {
            System.out.println("No mirror words!");
        } else{
            System.out.println("The mirror words are:");
            System.out.println(String.join(", ", matchedWords));
        }

    }
}
