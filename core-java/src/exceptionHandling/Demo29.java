package exceptionHandling;

import java.util.Scanner;

public class Demo29 {
    public static void main(String[] args) throws InvalidInputException {
        divide();
    }

    private static void divide() throws InvalidInputException {
        System.out.println("Enter two numbers");
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        if (number2 == 0) {
            throw new InvalidInputException("invalid denominator");
        }
        System.out.println(number1 / number2);
    }
}
