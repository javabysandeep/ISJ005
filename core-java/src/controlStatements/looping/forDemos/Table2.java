package controlStatements.looping.forDemos;

public class Table2 {
    public static void main(String[] args) {
        for (int row = 1; row <= 10; row++) {
            for (int col = 1; col <= 30; col++) {
                System.out.print(row * col + "\t");
            }
            System.out.println();
        }
    }
}
