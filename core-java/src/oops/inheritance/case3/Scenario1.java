package oops.inheritance.case3;

public class Scenario1 {
    public static void main(String[] args) {
        class Parent {
            int a = 100;

            void m1() {
                System.out.println("Parent m1");
            }
        }

        class Child extends Parent {

        }

        Parent parent = new Child();
        System.out.println(parent.a);
        parent.m1();
    }
}
