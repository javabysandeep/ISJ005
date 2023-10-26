package array;

public class Demo13SecondMinimumElement {
    public static void main(String[] args) {
        int[] array = {1099, 45, 38, 76, 790};
        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;
        for (int index = 0; index < array.length; index++) {
            if (min > array[index]) {
                secondMin = min;
                min = array[index];
            }
            if (secondMin > array[index] && array[index] > min) {
                secondMin = array[index];
            }
        }
        System.out.println("Minimum array element is " + min);
        System.out.println("Second Minimum array element is " + secondMin);

    }
}
