package controlStatements.looping.patterns;

public class Pattern11 {
    public static void main(String[] args) {
        for (int row = 5; row >= 1; row--) {
            for (int col = 1; col <= row; col++) {
                System.out.print(row % 2 != 0 ? 1+" " : 0 + " ");
            }
            System.out.println();
        }
    }
}
