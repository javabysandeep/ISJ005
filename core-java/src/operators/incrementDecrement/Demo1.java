package operators.incrementDecrement;

public class Demo1 {
    public static void main(String[] args) {
        int a = 5;
        int b = ++a; //pre-increment
        //
        System.out.println(a);//6
        System.out.println(b);//6

        int p = 5;
        int q = p++;//post increment
        System.out.println(p);//6
        System.out.println(q);//5
    }
}
