package controlStatements.looping.whileDemo.doWhileDemo;

public class Demo3 {
    public static void main(String[] args) {
        for (int i = 1; i >= 5; i++) {
            System.out.println("Printing multiple values using for loop");
            System.out.println(i);
        }

        int i = 1;
        while (i >= 5) {
            System.out.println("Printing multiple values using while");
            System.out.println(i);
            i++;
        }


        int j = 1;
        do {
            System.out.println("Printing multiple values using do while");
            System.out.println(j);
            j++;
        } while (j >= 5);
    }
}
