package controlStatements.looping.forDemos;

public class Table {
    public static void main(String[] args) {

        for (int number = 1; number <= 30; number++) {
            for (int i = 1; i <= 10; i++) {
                System.out.println(number * i);
            }
        }
    }
}
