package exceptionHandling;

public class Demo15 {
    public static void main(String[] args) {
        try {
            System.out.println(10 / 1);
            String str = null;
            System.out.println(str.length());
        } catch (ArithmeticException arithmeticException) {
            System.out.println("denominator is invalid");
        } catch (NullPointerException npe) {
            System.out.println("reference is null");
        } catch (Throwable throwable) {
            System.out.println("generic handler");
        }
        System.out.println("rest of the code");
    }
}
