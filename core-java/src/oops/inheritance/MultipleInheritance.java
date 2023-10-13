package oops.inheritance;

public class MultipleInheritance {
    public static void main(String[] args) {
        class A {
            void m1(){
                System.out.println("A : m1 method");
            }
        }
        class B {
            void m1(){
                System.out.println("B : m1 method");
            }
        }
       // class C extends A, B{}
    }
}
