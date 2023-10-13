package oops.inheritance;

public class Test {
    public static void main(String[] args) {
        class Parent {
            public void m1() {
                System.out.println("Parent m1");
            }
        }
        class Child extends Parent {
            public void m1() {
                System.out.println("Child m1");
            }
        }

        Parent pc = new Child();
        pc.m1();
    }
}
