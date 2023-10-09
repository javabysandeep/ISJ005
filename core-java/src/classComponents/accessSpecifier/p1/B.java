package classComponents.accessSpecifier.p1;

public class B {
    public static void main(String[] args) {
        System.out.println(A.a);
       // System.out.println(A.b);//private access specifier
        System.out.println(A.c);
        System.out.println(A.d);
    }
}
