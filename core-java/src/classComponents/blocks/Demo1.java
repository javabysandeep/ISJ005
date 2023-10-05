package classComponents.blocks;

public class Demo1 {
    Demo1() {
        //1. super class constructor call
        super();
        //2. instance block of same class
        System.out.println("Zero parameterized constructor");
    }

    {
        System.out.println("instance block1");
    }

    {
        System.out.println("instance block2");
    }

    static {
        System.out.println("static block1");
    }

    static {
        System.out.println("static block2");
    }

    public static void main(String[] args) {
        Demo1 d1 = new Demo1();
        Demo1 d2 = new Demo1();
    }
}
