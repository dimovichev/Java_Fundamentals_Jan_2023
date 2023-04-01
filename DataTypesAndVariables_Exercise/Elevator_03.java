package DataTypesAndVariables_Exercise;

import java.util.Scanner;

public class Elevator_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int persons = Integer.parseInt(scanner.nextLine());
        int capacity = Integer.parseInt(scanner.nextLine());

        double courses = Math.ceil(persons * 1.0 / capacity);
        System.out.printf("%.0f", courses);
    }
}
