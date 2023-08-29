package operators.logicalOperators;

public class Demo9 {
    public static void main(String[] args) {
        System.out.println(10 % 2 == 1 && 10 % 0 == 0);//false
//        System.out.println(10 % 2 == 1 & 10 % 0 == 0);//ArithmeticException Divide by Zero

        System.out.println(10 % 2 == 0 || 10 % 0 == 0);//true
      //  System.out.println(10 % 2 == 0 | 10 % 0 == 0);//ArithmeticException Divide by Zero
    }
}
