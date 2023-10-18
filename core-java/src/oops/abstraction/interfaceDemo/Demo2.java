package oops.abstraction.interfaceDemo;

public class Demo2 {
    public static void main(String[] args) {
        class Child implements I2 {
            @Override
            public void m2() {
                System.out.println("m2 method overridden");
            }
        }

        I2 i = new Child();
        i.m2();
    }
}
