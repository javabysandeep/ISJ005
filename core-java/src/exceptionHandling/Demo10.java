package exceptionHandling;

public class Demo10 {
    public static void main(String[] args) {
        try {
            System.out.println(10 / 2);
            System.out.println("rest of the try");
        } catch (ArithmeticException arithmeticException) {
            System.out.println("Alternate code");
        }
        System.out.println("Rest of the code");
    }
}
