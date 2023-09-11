package assignments.controlStatements.switchAssignments;

import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = scanner.nextInt();
        int input = number > 0 ? 1 : number < 0 ? -1 : 0;
        switch (input) {
            case 1 -> System.out.println("Its positive");
            case -1 -> System.out.println("Its negative");
            default -> System.out.println("Its zero");
        }
    }
}
