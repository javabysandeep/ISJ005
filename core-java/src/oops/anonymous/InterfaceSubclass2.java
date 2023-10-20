package oops.anonymous;

public class InterfaceSubclass2 {
    interface Parent {
        void m1();
    }

    public static void main(String[] args) {
        Parent parent = new Parent() {
            @Override
            public void m1() {
                System.out.println("Child: m1");
            }
        };
        parent.m1();
    }
}
