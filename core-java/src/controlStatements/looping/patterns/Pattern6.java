package controlStatements.looping.patterns;

public class Pattern6 {
    public static void main(String[] args) {
        /*
         *              1
         *            2 2
         *          3 3 3
         *        4 4 4 4
         *       5 5 5 5 5
         *
         *
         * */
        for (int row = 1; row <= 5; row++) {
            for (int space = 5 - row; space > 0; space--) {
                System.out.print("  ");
            }
            for (int column = 1; column <= row; column++) {
                System.out.print(row + " ");
            }
            System.out.println();
        }
    }
}
