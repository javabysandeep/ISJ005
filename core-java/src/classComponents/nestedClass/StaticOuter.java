package classComponents.nestedClass;

public class StaticOuter {
    static int staticOuterVariable = 100;

    static void staticOuterMethod() {
        System.out.println("static method of outer class");
    }

    static class StaticNested {
        static int a = 100;
        int b = 200;

        static void m1() {
            System.out.println("StaticNested m1 method");
        }

        void m2() {
            System.out.println("StaticNested m2 method");
        }

    }
}
