package oops.inheritance;

public class AccessingMembers {
    public static void main(String[] args) {
        class Parent {
            int a = 10;
        }
        class Child extends Parent {
            int a = 100;
            int b = 200;

            void printAllVariables() {
                int a = 1000;
                int b = 2000;
                System.out.println("Local variable "+a);
                System.out.println("Local variable "+b);

                System.out.println("Instance variable "+this.a);
                System.out.println("Instance variable "+this.b);

                System.out.println("Super class Instance variable "+super.a);
            }
        }

        Child child = new Child();
        child.printAllVariables();

    }
}
