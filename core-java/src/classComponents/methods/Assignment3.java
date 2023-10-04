package classComponents.methods;

import java.util.Scanner;

public class Assignment3 {
    public static void main(String[] args) {
        System.out.println("Enter a age");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        System.out.println("Is Eligible to vote " + Assignment3.isEligibleToVote(age));
    }

    private static boolean isEligibleToVote(int age) {
        return age >= 18;
    }

}
