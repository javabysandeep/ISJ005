package assignments.controlStatements.forLoop;

import java.util.Scanner;

public class Assignment7Factorial {
    public static void main(String[] args) {
        // 5! = 1 * 2 * 3 * 4 * 5 = 120
        System.out.println("Enter the number ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial = factorial  * i;
        }
        System.out.println("Factorial "+factorial);
    }
}
