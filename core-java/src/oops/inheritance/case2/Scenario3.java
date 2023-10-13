package oops.inheritance.case2;

public class Scenario3 {
    public static void main(String[] args) {
        class Parent {
            int a = 100;

            void m1() {
                System.out.println("Parent m1");
            }
        }

        class Child extends Parent {
            int a = 1000;

            void m1() {
                System.out.println("Child m1");
            }
        }

        Child child = new Child();
        System.out.println(child.a);
        child.m1();
    }
}
