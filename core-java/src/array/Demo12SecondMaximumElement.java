package array;

public class Demo12SecondMaximumElement {
    public static void main(String[] args) {
        int[] array = {1099, 45, 38, 76, 790};
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int index = 0; index < array.length; index++) {
            if (max < array[index]) {
                secondMax = max;
                max = array[index];
            }
            if (secondMax < array[index] && array[index] < max) {
                secondMax = array[index];
            }
        }
        System.out.println("Maximum array element is " + max);
        System.out.println("Second Maximum array element is " + secondMax);

    }
}
