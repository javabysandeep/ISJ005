package exceptionHandling;

public class Demo30 {
    public static void main(String[] args) throws ClassNotFoundException {
        //Test test = new Test();
        Class.forName("exceptionHandling.Test123");
    }
}

class Test {
    static {
        System.out.println("Test class static block");
    }
}