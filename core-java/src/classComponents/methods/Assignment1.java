package classComponents.methods;

import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {
        System.out.println("Enter three numbers");
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();
        System.out.println("Maximum " + Assignment1.maximum(number1, number2, number3));
        System.out.println("Minimum " + Assignment1.minimum(number1, number2, number3));
    }

    private static int maximum(int number1, int number2, int number3) {
        return number1 > number2 && number1 > number3
                ? number1
                : number2 > number1 && number2 > number3
                ? number2 : number3;
    }

    private static int minimum(int number1, int number2, int number3) {
        return number1 < number2 && number1 < number3
                ? number1
                : number2 < number1 && number2 < number3
                ? number2 : number3;
    }

}
