package oops.anonymous;

public class AbstractClassSubclass {
    public static void main(String[] args) {
        abstract class Parent {
            void m1() {
                System.out.println("Parent: m1");
            }
        }
        class Child extends Parent {
        }

        Parent parent = new Child();
        parent.m1();
    }
}
