package oops.abstraction;

abstract public class Demo3 {
    int a = 100;
    static int b = 200;

    void m1() {
        System.out.println("Abstract class : m1 method");
    }

    {
        System.out.println("abstract class : instance block ");
    }

    Demo3() {
        //1. constructor call
        //2. instance block
        System.out.println("abstract class : constructor ");
    }

    static {
        System.out.println("abstract class : static block ");
    }

    static void m2() {
        System.out.println("Abstract class : static m2 method");
    }

    public static void main(String[] args) {
        System.out.println("static variable "+Demo3.b);
        Demo3.m2();

        //iv, im, ib, con
        class Subclass extends Demo3{
            Subclass(){
                super();
                //instance block
            }
        }
        Subclass ref = new Subclass();
        System.out.println(ref.a);
        ref.m1();

    }
}
