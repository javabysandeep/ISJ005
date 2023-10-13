package oops.inheritance;

public class R extends Q {
    static {
        System.out.println("R : static block");
    }

    {
        System.out.println("R : instance block");
    }

    R() {
        //1. call to the constructor : parent class or same class
        super();
        //2. call to the instance block
        System.out.println("R : Constructor");
    }

    public static void main(String[] args) {
        R r = new R();
    }
}
