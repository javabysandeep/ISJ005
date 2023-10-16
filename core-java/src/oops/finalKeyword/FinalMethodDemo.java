package oops.finalKeyword;

public class FinalMethodDemo {
    public static void main(String[] args) {
        class Parent {
            //final method cannot be overriden
            /*final*/ public void m1() {
                System.out.println("Parent : m1");
            }
        }
        class Child extends Parent {
            public void m1() {
                System.out.println("Child : m1");
            }
        }
    }
}
