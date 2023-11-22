package exceptionHandling;

public class Demo20 {
    public static void main(String[] args) {
        try {
            System.out.println(10 / 1);
            System.exit(0);
        } finally {
            System.out.println("finally block");
        }
        System.out.println("Rest of the code");
    }
}
