package array;

public class Demo14ArrayReverse {
    public static void main(String[] args) {
        int[] array = {1099, 45, 38, 76, 790};
        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }

        for (int index = 0; index < array.length; index++) {
            System.out.print(array[index] + " ");
        }
    }
}
