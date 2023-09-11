package acceptInput;

import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        System.out.println("Enter the integer value");
        Scanner scanner = new Scanner(System.in);
        int intValue = scanner.nextInt();
        System.out.println("You have entered : "+intValue);
    }
}
