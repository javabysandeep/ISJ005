package exceptionHandling;

public class Demo14 {
    public static void main(String[] args) {
        try {
            System.out.println(10 / 0);
            String str = null;
            System.out.println(str.length());
            System.out.println("rest of the try");
        } catch (ArithmeticException arithmeticException) {
            System.out.println("Alternate code");
            System.out.println(10 / 0);
        } catch (NullPointerException npe) {
            System.out.println("null reference");
        }
        System.out.println("Rest of the code");
    }
}
