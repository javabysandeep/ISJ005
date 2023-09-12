package controlStatements.looping.forDemos;

import java.util.Scanner;

public class Demo21SumOfFactors {
    public static void main(String[] args) {
        System.out.println("Enter the number ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        System.out.println("Sum of factors " + sum);
        System.out.println(sum == number ? "Perfect number" : "Not a perfect number");
    }
}
