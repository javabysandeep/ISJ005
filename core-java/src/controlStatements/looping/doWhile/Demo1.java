package controlStatements.looping.doWhile;

public class Demo1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        for (; a > b; ) {
            System.out.println("*");
        }
        // for: 0 - *
        while (a > b) {
            System.out.println("*");
        }
        // while : 0 - *

        do {
            System.out.println("*");
        } while (a > b);
        //

    }
}
