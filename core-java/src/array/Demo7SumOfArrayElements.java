package array;

public class Demo7SumOfArrayElements {
    public static void main(String[] args) {
        int[] values = {10, 30, 50, 44, 78};
        int sum = 0;
        for (int index = 0; index < values.length; index++) {
            sum = sum + values[index];
        }
        System.out.println("Sum of array elements is " + sum);
    }
}
