package exceptionHandling;

import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        System.out.println("Enter two numbers for division");
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        System.out.println("Division is : " + number1 / number2);
        System.out.println("Rest of the code");
    }
}
