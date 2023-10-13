package oops.inheritance.case2;

public class Scenario2 {
    public static void main(String[] args) {
        class Parent {

        }

        class Child extends Parent {
            int a = 100;

            void m1() {
                System.out.println("Child m1");
            }
        }

        Child child = new Child();
        System.out.println(child.a);
        child.m1();
    }
}
