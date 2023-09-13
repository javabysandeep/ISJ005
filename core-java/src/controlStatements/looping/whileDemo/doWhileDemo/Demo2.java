package controlStatements.looping.whileDemo.doWhileDemo;

import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char ch = ' ';
        do {
            System.out.println("Enter the character");
            ch = scanner.next().charAt(0);
            System.out.println("You have entered " + ch);
            System.out.println("Do you want to continue");
        } while (ch != 'x');
    }
}

