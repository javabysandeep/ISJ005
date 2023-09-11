package acceptInput;

import java.util.Scanner;

public class Demo5 {
    public static void main(String[] args) {
        System.out.println("Enter the string value");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        System.out.println("You have entered string value :" + string);
    }
}
