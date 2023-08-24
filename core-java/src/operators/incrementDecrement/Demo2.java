package operators.incrementDecrement;

public class Demo2 {
    public static void main(String[] args) {
        int a = 5;
        int b = --a; //pre-decrement
        //
        System.out.println(a);//4
        System.out.println(b);//4

        int p = 5;
        int q = p--;//post decrement
        System.out.println(p);//4
        System.out.println(q);//5
    }
}
