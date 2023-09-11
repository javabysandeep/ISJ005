package controlStatements.looping.forDemos;

public class Demo12 {
    public static void main(String[] args) {
        //even numbers from 1 to 100
       /* for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }*/

        for (int i = 2; i <= 100; i += 2) {
            System.out.println(i);
        }
    }
}
