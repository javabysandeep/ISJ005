package classComponents.variables;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        System.out.println(10/0);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        System.out.println(number == sum ? "perfect" : "not a perfect");
    }
}
