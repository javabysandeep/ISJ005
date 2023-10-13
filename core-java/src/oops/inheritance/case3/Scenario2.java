package oops.inheritance.case3;

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

        Parent parent = new Child();
        /*System.out.println(parent.a);
        parent.m1();*/
    }
}
