package oops.inheritance;

public class P {
    static {

        System.out.println("P : static block");
    }

    {
        System.out.println("P : instance block");
    }

    P() {
        //1. call to the constructor : parent class
        //2. call to the instance block
        System.out.println("P : Constructor");
    }

}
