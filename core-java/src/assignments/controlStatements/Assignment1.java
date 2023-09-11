package assignments.controlStatements;

import java.util.Scanner;

public class Assignment1 {
    //Take values of length and breadth of a rectangle from user and check if it is square or not.
    public static void main(String[] args) {
        System.out.println("Enter the length and breadth");
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int breadth = scanner.nextInt();
        // System.out.println(length == breadth ? "It's square" : "its not a square");
        if (length == breadth) {
            System.out.println("it's a square");
        } else {
            System.out.println("its not a square");
        }
    }
}
