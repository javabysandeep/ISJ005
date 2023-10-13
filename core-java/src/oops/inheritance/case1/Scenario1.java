package oops.inheritance.case1;

public class Scenario1 {
    //case 1 : Parent parent = new Parent();
    //  everything from the parent class will be accessible.
    // parent class reference cannot access anything from child class
    public static void main(String[] args) {
        class Parent {
            int a = 100;

            void m1() {
                System.out.println("Parent m1");
            }
        }

        class Child extends Parent {

            void m2() {
                System.out.println("Parent m2");
            }
        }

        Parent parent = new Parent();
        System.out.println(parent.a);
        parent.m1();
    }
}
