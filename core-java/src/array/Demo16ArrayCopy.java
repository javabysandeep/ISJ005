package array;

public class Demo16ArrayCopy {
    public static void main(String[] args) {
        int[] array = {1099, 45, 38, 76, 790};
        int[] array2 = new int[array.length];
        for (int index = 0; index < array.length; index++) {
            array2[index] = array[index];
        }

        for (int index = 0; index < array2.length; index++) {
            System.out.print(array2[index] + " ");
        }
    }
}
