package controlStatements.looping.forDemos;

import java.util.Scanner;

public class Demo19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter total classes held and total attended classes");
        int totalClassesHeld = scanner.nextInt();
        int totalClassesAttended = scanner.nextInt();
        System.out.println(((double) (totalClassesAttended ))/ totalClassesHeld * 100);
    }
}
