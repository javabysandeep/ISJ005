package oops.anonymous;

import javafx.scene.Parent;

public class InterfaceSubclass {
    interface Parent {
        void m1();
    }

    public static void main(String[] args) {

        class Child implements Parent {
            @Override
            public void m1() {
                System.out.println("Child: m1");
            }
        }

        Parent parent = new Child();
        parent.m1();
    }
}
