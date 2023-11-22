package exceptionHandling;

public class Demo22 {
    public static void main(String[] args) {
        System.out.println(divide(10, 0));
    }

    private static int divide(int number1, int number2) {
        try {
            return number1 / number2;
        } catch (ArithmeticException arithmeticException) {
            System.out.println("invalid denominator");
        }
        return -1;
    }
}
