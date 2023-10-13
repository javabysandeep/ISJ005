package oops.inheritance;

public class CommonCode {
    //non-static, non-private, non-final
    int a;
    int b;
    int c;
    int d;


    CommonCode() {
        System.out.println("Common Code : zero param constructor");
    }

    void m1() {
        System.out.println("Common Code : m1()");
    }

    void m2() {
        System.out.println("Common Code : m2()");
    }
}
