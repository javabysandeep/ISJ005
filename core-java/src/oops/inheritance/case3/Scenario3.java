package oops.inheritance.case3;

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

        Parent parent = new Child();
        System.out.println(parent.a);//variables from parent class
        parent.m1();//methods from child class
    }
}
