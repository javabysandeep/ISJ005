package exceptionHandling;

public class Demo18 {
    public static void main(String[] args) {
        try {
            System.out.println(10 / 1);
        } finally {
            System.out.println("finally block");
        }
        System.out.println("Rest of the code");
    }
}
