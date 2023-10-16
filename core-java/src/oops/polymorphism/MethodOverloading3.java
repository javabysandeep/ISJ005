package oops.polymorphism;

public class MethodOverloading3 {
    public static void main(String[] args) {
        class Parent {
            public int add(int number1, int number2) {
                return number1 + number2;
            }
        }
        class Child extends Parent {
            public int add(int number1, int number2, int number3) {
                return number1 + number2 + number3;
            }
        }
        Child child = new Child();
        System.out.println(child.add(10, 20));
        System.out.println(child.add(10, 20, 30));
    }
}
