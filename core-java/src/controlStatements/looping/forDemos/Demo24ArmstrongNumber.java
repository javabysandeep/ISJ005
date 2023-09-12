package controlStatements.looping.forDemos;

import java.util.Scanner;

public class Demo24ArmstrongNumber {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int oldNumber = number;

        //armstrong number
        int sum = 0;

        while (number > 0) {
            int digit = number % 10;
            sum = sum + digit * digit * digit;
            number = number / 10;
        }
        System.out.println("Sum of cube of digits " + sum);
        System.out.println(oldNumber == sum ? "Armstrong" : "Not a armstrong number");
    }
}
