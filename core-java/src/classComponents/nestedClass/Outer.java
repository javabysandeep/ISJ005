package classComponents.nestedClass;

public class Outer {
    int outerInstanceVariable = 100;

    class Inner {
        //static variable, static method, static block, static nested class is not allowed inside the inner class
        int a;

        void m1() {
            System.out.println("Inner class : instance method");
        }

        Inner() {
            System.out.println("Inner class : constructor");
        }

        {
            System.out.println("Inner class: instance block");
        }

    }
}
