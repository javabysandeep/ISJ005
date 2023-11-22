package exceptionHandling;

public class Demo17 {
    public static void main(String[] args) {
        try {
            System.out.println(10 / 1);
        } catch (ArithmeticException arithmeticException) {
            System.out.println("Alternate code");
            System.out.println(10 / 0);
        } finally {
            System.out.println("finally block");
        }
        System.out.println("Rest of the code");
    }
}
