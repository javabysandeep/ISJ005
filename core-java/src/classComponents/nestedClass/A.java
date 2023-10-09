package classComponents.nestedClass;

public class A {
    class B {
        class C {
            int instanceVariable;

            void instanceMethod() {
                System.out.println("C class instance method");
            }
        }
    }

    public static void main(String[] args) {
        A a = new A();
        A.B b = a.new B();
        A.B.C c = b.new C();
        System.out.println(c.instanceVariable);
        c.instanceMethod();
    }
}
