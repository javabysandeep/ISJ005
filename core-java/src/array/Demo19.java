package array;

public class Demo19 {
    public static void main(String[] args) {
        int[] array = {1, 0, 0, 1, 0, 1, 1};

        for (int index = 0; index < array.length - 1; index++) {
            if (array[index] > array[index + 1]) {
                int temp = array[index];
                array[index] = array[index + 1];
                array[index + 1] = temp;
            }
        }
        for (int temp : array) {
            System.out.print(temp + " ");
        }

    }
}
