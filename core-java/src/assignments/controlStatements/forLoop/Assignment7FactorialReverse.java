package assignments.controlStatements.forLoop;

import java.util.Scanner;

public class Assignment7FactorialReverse {
    public static void main(String[] args) {
        // 5! = 1 * 2 * 3 * 4 * 5 = 120
        System.out.println("Enter the number ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int factorial = 1;
        for (int i = number; i >= 1; i--) {
            factorial = factorial * i;
        }
        System.out.println("Factorial " + factorial);
    }
}
