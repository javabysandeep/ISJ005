package exceptionHandling;

public class Demo27 {
    public static void main(String[] args) {
        //implicitly ArithmeticException class object is created, and it is thrown to JRE
        //System.out.println(10/0);

        //explicitly create the ArithmeticException class object and throw it
        throw new ArithmeticException("divide by zero");
    }
}
