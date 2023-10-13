package oops.inheritance;

public class Q extends P {
    static {
        System.out.println("Q : static block");
    }

    {
        System.out.println("Q : instance block");
    }
    Q() {
        //1. call to the constructor : parent class or same class
        super();
        //2. call to the instance block
        System.out.println("Q : Constructor");
    }
}
