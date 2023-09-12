package controlStatements.looping.patterns;

public class Pattern10 {
    public static void main(String[] args) {
        /*
         *       * * * * *
         *        * * * *
         *         * * *
         *          * *
         *           *
         *
         *
         * */
        for (int row = 5; row >= 1; row--) {
            for (int space = 0; space < 5 - row; space++) {
                System.out.print(" ");
            }
            for (int column = 1; column <= row; column++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
