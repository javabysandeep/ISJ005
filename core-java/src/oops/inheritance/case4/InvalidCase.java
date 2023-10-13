package oops.inheritance.case4;

public class InvalidCase {
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

        //Child cp = new Parent();//CTE

    }
}
