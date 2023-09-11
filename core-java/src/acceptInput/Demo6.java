package acceptInput;

import java.util.Scanner;

public class Demo6 {
    public static void main(String[] args) {
        System.out.println("Enter a character ");
        Scanner scanner = new Scanner(System.in);
        char ch = scanner.next().charAt(0);
        System.out.println("you have entered "+ch);
    }
}
