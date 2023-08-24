package operators.arithmetic;

public class Demo5 {
    public static void main(String[] args) {

        //1. ArithmeticException :  // if the denominator is zero and numerator is [byte, short, int, long, char]
        //System.out.println(10 / 0);//ArithmeticException
        // System.out.println(10 % 0);//ArithmeticException
        //System.out.println('A' / 0);//ArithmeticException


        //2.Infinity
        System.out.println(10.0f / 0);//Infinity

        //3. NaN
        System.out.println(10.0f % 0);//NaN
    }
}
