package assignments.controlStatements;

import java.util.Scanner;

public class Assignment2 {
    //Take two int values from user and print greatest among them.
    public static void main(String[] args) {
        System.out.println("Enter two integer values");
        Scanner scanner = new Scanner(System.in);
        int value1 = scanner.nextInt();
        int value2 = scanner.nextInt();

        if (value1 > value2) {
            System.out.println(value1);
        } else {
            System.out.println(value2);
        }
    }
}
