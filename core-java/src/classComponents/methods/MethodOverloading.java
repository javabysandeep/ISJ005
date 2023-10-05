package classComponents.methods;

public class MethodOverloading {
    static int add(int number1, int number2) {
        return number1 + number2;
    }

    static double add(double number1, double number2) {
        return number1 + number2;
    }

    static int add(int number1, int number2, int number3) {
        return number1 + number2 + number3;
    }

    public static void main(String[] args) {
        System.out.println(add(10, 20));
        System.out.println(add(10, 20, 30));
        System.out.println(add(10.5, 50.5));
    }
}
