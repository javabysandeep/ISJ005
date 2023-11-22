package exceptionHandling;

public class Demo25 {
    public static void main(String[] args) {
        try {
            m1();
        } catch (ArithmeticException e) {
            System.out.println("Invalid denominator");
        }
    }

    private static void m1() {
        m2();
    }

    private static void m2() {
        m3();
    }

    private static void m3() {
        m4();
    }

    private static void m4() {
        System.out.println(10 / 0);
    }

}
