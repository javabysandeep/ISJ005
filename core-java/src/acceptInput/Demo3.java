package acceptInput;

import java.util.Scanner;

public class Demo3 {
    public static void main(String[] args) {
        System.out.println("Enter the float value");
        Scanner scanner = new Scanner(System.in);
        float floatValue = scanner.nextFloat();
        System.out.println("You have entered : "+floatValue);
    }
}
