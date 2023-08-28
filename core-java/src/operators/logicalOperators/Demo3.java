package operators.logicalOperators;

public class Demo3 {
    public static void main(String[] args) {
        System.out.println(10 % 3 == 1 || 10 / 0 == 0);//true
        System.out.println(10 % 3 == 0 || 10 / 0 == 0);//AE
    }
}
