package oops.anonymous;

public class ConcreteClassSubclass2 {
    public static void main(String[] args) {
        class Parent {
            void m1() {
                System.out.println("Parent: m1");
            }
        }
        Parent parent = new Parent() {
            @Override
            void m1() {
                System.out.println("Child:m1");
            }
        };
        parent.m1();
    }
}
