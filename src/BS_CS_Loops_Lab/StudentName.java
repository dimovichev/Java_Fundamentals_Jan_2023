package BS_CS_Loops_Lab;

import java.util.Scanner;

public class StudentName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String studentName = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        double avgGrade = Double.parseDouble(scanner.nextLine());

        String outputData = String.format("Name: %s, Age: %d, Grade: %.2f", studentName, age, avgGrade);

        System.out.println(outputData);
    }
}
