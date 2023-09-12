package controlStatements.looping.patterns;

public class Pattern8 {
    public static void main(String[] args) {
        /*
         *          *
         *         * *
         *        * * *
         *       * * * *
         *      * * * * *
         *
         * */
        for (int row = 1; row <= 50; row++) {
            for (int space = 50 - row; space > 0; space--) {
                System.out.print(" ");
            }
            for (int star = 1; star <= row; star++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
