package oops.anonymous;

public class ConcreteClassSubclass {
    public static void main(String[] args) {
        class Parent {
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
