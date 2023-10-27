package array;

public class Demo28SubArray {
    public static void main(String[] args) {
        char[] array = {'a', 'b', 'c', 'a', 'a', 'g', 'a', 'e', 'd'};
        char[] subArray = createSubArray(array, 0, 5);
        for (char ch : subArray) {
            System.out.print(ch);
        }

    }

    private static char[] createSubArray(char[] array, int start, int end) {
        if (array == null) {
            return null;
        }
        if (start < 0 || end < 0 || start > array.length || end > array.length) {
            return null;
        }
        if (start > end) {
            return null;
        }

        char[] result = new char[end - start + 1];
        for (int index = 0; index < result.length; index++) {
            result[index] = array[start++];
        }
        return result;
    }


}
