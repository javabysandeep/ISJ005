package oops.abstraction;

public class Demo4 {
    public static void main(String[] args) {
        abstract class Parent {
            abstract void m1();
            abstract void m2();
        }
         class Child extends Parent {
             @Override
             void m1() {
                 System.out.println("m1 : Method overridden");
             }

             @Override
             void m2() {
                 System.out.println("m2 : Method overridden");
             }
         }
         Parent parent = new Child();
        parent.m1();
        parent.m2();
    }
}
