package controlStatements.looping.whileDemo;

import java.util.Scanner;

public class Demo8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the character");
        char ch = scanner.next().charAt(0);
        while (ch != 'x') {
            System.out.println("You have entered " + ch);
            System.out.println("Enter the character");
            ch = scanner.next().charAt(0);
        }
    }
}
