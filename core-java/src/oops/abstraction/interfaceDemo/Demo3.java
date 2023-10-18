package oops.abstraction.interfaceDemo;

public class Demo3 {
    public static void main(String[] args) {
        class A implements I3 {
            @Override
            public void m3() {
                System.out.println("m3 method overridden");
            }
        }
    }
}
