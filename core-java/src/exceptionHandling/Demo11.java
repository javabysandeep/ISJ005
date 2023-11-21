package exceptionHandling;

public class Demo11 {
    public static void main(String[] args) {
        try {
            System.out.println(10 / 2);
            String str = null;
            System.out.println(str.length());
            System.out.println("rest of the try");
        } catch (ArithmeticException arithmeticException) {
            System.out.println("Alternate code");
        }
        System.out.println("Rest of the code");
    }
}
