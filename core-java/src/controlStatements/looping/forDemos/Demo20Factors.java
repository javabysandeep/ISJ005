package controlStatements.looping.forDemos;

import java.util.Scanner;

public class Demo20Factors {
    public static void main(String[] args) {
        System.out.println("Enter the number ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        //10 : 1, 2, 5
        //6 : 1, 2, 3
        //28 : 1, 2, 4, 7, 14
        //Perfect number = sum of factors is equal to given number
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                System.out.print(i+", ");
            }
        }
    }
}
