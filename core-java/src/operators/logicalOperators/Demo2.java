package operators.logicalOperators;

public class Demo2 {
    public static void main(String[] args) {
        System.out.println(10 % 3 == 0 && 10 / 3 == 1);//false

        System.out.println(10 % 2 == 3 && 10 / 0 == 0);//false
        System.out.println(10 / 0 == 0 && 10 % 2 == 0 );//AirthmeticException
        System.out.println(10 % 2 == 0 && 10 / 0 == 0);//AirthmeticException
    }
}
