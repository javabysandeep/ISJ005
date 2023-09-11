package acceptInput;

import java.util.Scanner;

public class Demo4 {
    public static void main(String[] args) {
        System.out.println("Enter the boolean value");
        Scanner scanner = new Scanner(System.in);
        boolean booleanValue = scanner.nextBoolean();
        System.out.println("You have entered : " + booleanValue);
    }
}
