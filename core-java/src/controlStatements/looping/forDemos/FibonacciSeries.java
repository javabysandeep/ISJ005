package controlStatements.looping.forDemos;

public class FibonacciSeries {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int c = 0;
        for (int i = 1; i <= 10; i++) {
            c = a + b;
            a = b;
            b = c;
            System.out.print(c + " ");
        }
    }
}
