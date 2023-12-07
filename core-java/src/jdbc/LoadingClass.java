package jdbc;

public class LoadingClass {
    static {
        System.out.println("Demo 2 class static block");
    }

    public static void main(String[] args) throws ClassNotFoundException {
        //A a = new A();
        Class.forName("jdbc.A");
    }
}
