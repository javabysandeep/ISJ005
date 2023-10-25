package array;

public class Demo8EvenArrayElements {
    public static void main(String[] args) {
        int[] values = {11, 33, 50, 44, 78};
        for (int index = 0; index < values.length; index++) {
            if (values[index] % 2 == 0) {
                System.out.println(values[index]);
            }
        }
    }
}
