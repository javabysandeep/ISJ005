package oops.polymorphism;

public class MethodOverloading2 {
    private static int add(int number1, int number2) {
        return number1 + number2;
    }

    private static int add(int number1, int number2, int number3) {
        return number1 + number2 + number3;
    }

    private static double add(double number1, double number2) {
        return number1 + number2;
    }

    private static String add(String str1, String str2) {
        return str1 + str2;
    }

    public static void main(String[] args) {
        System.out.println(add(10, 20));
        System.out.println(add(10, 20, 30));
        System.out.println(add(10.5d, 10));
        System.out.println(add("Good ", "Morning"));
    }
}
