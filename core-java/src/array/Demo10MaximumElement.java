package array;

public class Demo10MaximumElement {
    public static void main(String[] args) {
        int[] array = {1099, 45, 38, 76, 790};
        int max = Integer.MIN_VALUE;
        for (int index = 0; index < array.length; index++) {
            if (max < array[index]) {
                max = array[index];
            }
        }
        System.out.println("Maximum array element is " + max);

    }
}
