package exceptionHandling;

public class Demo16 {
    public static void main(String[] args) {
        try {
            System.out.println(10 / 1);
            String str = null;
            System.out.println(str.length());
        } catch (ArithmeticException | NullPointerException | ArrayIndexOutOfBoundsException exception) {
            System.out.println("this has caused due to " + exception.getMessage());
        }
        System.out.println("rest of the code");
    }
}
