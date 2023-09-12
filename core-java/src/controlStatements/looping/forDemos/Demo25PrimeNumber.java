package controlStatements.looping.forDemos;

import java.util.Scanner;

public class Demo25PrimeNumber {
    public static void main(String[] args) {
        System.out.println("Enter the number ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        //prime number : 2,3,5,7,11,13,17,19,..
        //101 :
        boolean isPrime = true;
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        System.out.println(isPrime ? "Its prime" : "its not a prime");
    }
}
