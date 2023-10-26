package array;

public class Demo15ArrayReplace {
    public static void main(String[] args) {
        int[] array = {1099, 45, 38, 76, 790};
        for (int index = 0; index < array.length; index++) {
            if (array[index] % 2 == 0) {
                array[index] = 1;
            } else {
                array[index] = 0;
            }
        }

        for (int index = 0; index < array.length; index++) {
            System.out.print(array[index] + " ");
        }
    }
}
