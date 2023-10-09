package classComponents.nestedClass;

public class InnerClassTest {
    public static void main(String[] args) {
        Outer outer = new Outer();
        System.out.println("Outer class instance variable " + outer.outerInstanceVariable);

        Outer.Inner inner = outer.new Inner();
        System.out.println("Inner class instance variable" + inner.a);
        inner.m1();
    }
}
