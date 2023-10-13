package oops.inheritance;

public class A extends CommonCode {
    A() {
        super();
        System.out.println("A : zero param constructor");
    }

    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.a);
        System.out.println(a.b);
        System.out.println(a.c);
        System.out.println(a.d);
        a.m1();
        a.m2();
    }
}
