package controlStatements.looping.forDemos;

import java.util.Scanner;

public class Demo22SumOfDigits {
    public static void main(String[] args) {
        System.out.println("Enter the number ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();//123 --> 6
        int sum = 0;

        for (; number > 0; ) {
            int digit = number % 10;
            sum += digit;
            number = number / 10;
        }
        System.out.println("Sum of digits " + sum);


    }
}
