package exceptionHandling;

public class Demo19 {
    public static void main(String[] args) {
        System.out.println(getValue());//3
    }

    private static int getValue() {
        try {
            return 1;
        } catch (Exception e) {
            return 2;
        } finally {
            return 3;
        }
    }
}
