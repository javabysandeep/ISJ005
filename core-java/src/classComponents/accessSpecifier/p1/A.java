package classComponents.accessSpecifier.p1;

public class A {
    static public int a = 10;
    static private int b = 20;
    static protected int c = 30;
    static int d = 40;

    public static void main(String[] args) {
        System.out.println(A.a);
        System.out.println(A.b);
        System.out.println(A.c);
        System.out.println(A.d);
    }
}
