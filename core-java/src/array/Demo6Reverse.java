package array;

public class Demo6Reverse {
    public static void main(String[] args) {
        int[] values = {10, 30, 50, 44, 78};
        for (int index = values.length-1; index >= 0; index--) {
            System.out.print(values[index] + " ");
        }
    }
}
