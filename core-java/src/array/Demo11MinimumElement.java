package array;

public class Demo11MinimumElement {
    public static void main(String[] args) {
        int[] array = {1099, 45, 38, 76, 790};
        int min = Integer.MAX_VALUE;
        for (int index = 0; index < array.length; index++) {
            if (min > array[index]) {
                min = array[index];
            }
        }
        System.out.println("Minimum array element is " + min);

    }
}
