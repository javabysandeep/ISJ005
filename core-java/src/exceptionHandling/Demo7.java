package exceptionHandling;

public class Demo7 {
    public static void main(String[] args) {
        //System.out.println(10 / 0);
        throw new ArithmeticException("/ by zero");
        //   System.out.println("rest of the code");
    }
}
