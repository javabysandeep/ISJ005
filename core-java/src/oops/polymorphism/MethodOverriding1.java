package oops.polymorphism;

public class MethodOverriding1 {
    public static void main(String[] args) {
        class Parent {
            public int add(int number1, int number2) {
                System.out.println("Parent class add method");
                return number1 + number2;
            }
        }
        class Child extends Parent {
            public int add(int number1, int number2) {
                System.out.println("child class add method");
                return number1 + number2;
            }
        }
        Child child = new Child();
        System.out.println(child.add(10, 20));
    }
}
