package operators.incrementDecrement;

public class Demo3 {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        System.out.println(a++ + --b + a++ + --a);//22
        System.out.println(a);
        System.out.println(b);
    }
}
