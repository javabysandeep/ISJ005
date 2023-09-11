package acceptInput;

import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        System.out.println("Enter the byte value");
        Scanner scanner = new Scanner(System.in);
        byte byteValue = scanner.nextByte();
        System.out.println("You have entered : "+byteValue);
    }
}
