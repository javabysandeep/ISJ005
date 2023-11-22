package exceptionHandling;

public class Demo23 {
    public static void main(String[] args) {
        try {
            divide(10, 0);
        } catch (ArithmeticException arithmeticException) {
            System.out.println("Exception handled in main method");
        }
    }

    private static void divide(int number1, int number2) throws ArithmeticException{
        System.out.println(number1 / number2);
    }
}
