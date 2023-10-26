package array;

public class Demo4AccessingArrayElementsUsingForLoop {
    public static void main(String[] args) {
        int[] values = new int[5];
        for (int index = 0; index < values.length; index++) {
            System.out.println(values[index]);
        }
    }
}
