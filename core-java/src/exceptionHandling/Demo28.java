package exceptionHandling;

public class Demo28 {
    public static void main(String[] args) {
        try {
            //System.out.println(10 / 0);
            throw new ArithmeticException("/ by zero");
        } catch (ArithmeticException arithmeticException) {
            System.out.println("invalid input");
        }
    }
}
