package classComponents.methods;

import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println("Is Even " + Assignment2.isEven(number));
    }

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }

}
