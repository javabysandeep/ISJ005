package exceptionHandling;

public class Demo8 {
    public static void main(String[] args) {
        try {
            System.out.println(10 / 0);
        } catch (ArithmeticException arithmeticException) {
            System.out.println("Alternate code");
        }
        System.out.println("Rest of the code");
    }
}
