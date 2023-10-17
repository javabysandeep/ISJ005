package oops.abstraction;

public class Demo5 {
    public static void main(String[] args) {
        abstract class GrandParent {
            abstract void m1();

            abstract void m2();
        }
        abstract class Parent extends GrandParent {
            @Override
            void m1() {
                System.out.println("m1");
            }

            @Override
            void m2() {
                System.out.println("m2");
            }

            abstract void m3();
        }
        class GrandChild extends Parent {
            @Override
            void m3() {
                System.out.println("m2");
            }
        }

        GrandParent gc = new GrandChild();
        gc.m1();
        gc.m2();
        // gc.m3();
        Parent pc = new GrandChild();
        pc.m1();
        pc.m2();
        pc.m3();

    }
}
