package assignments.controlStatements.forLoop;

import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 10 numbers");
        float sum = 0;
        for (int i = 1; i <= 5; i++) {
            sum += scanner.nextFloat();
        }
        System.out.println("Sum " + sum);
        System.out.println("Average " + sum / 5);
    }
}
