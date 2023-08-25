package operators.logicalOperators;

public class Demo1 {
    public static void main(String[] args) {
        System.out.println("Logical AND Operation");
        System.out.println(true && true);//true
        System.out.println(false && false);//false
        System.out.println(true && false);//false
        System.out.println(false && true);//false

        System.out.println("Logical OR Operation");
        System.out.println(true || true);//true
        System.out.println(false || false);//false
        System.out.println(true || false);//true
        System.out.println(false || true);//true

        System.out.println("Logical NOT Operation");
        System.out.println(!true);//false
        System.out.println(!false);//true
    }
}
