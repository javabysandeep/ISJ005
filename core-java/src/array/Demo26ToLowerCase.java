package array;

public class Demo26ToLowerCase {
    public static void main(String[] args) {
        char[] array = {'A', 'B', 'C', 'D', 'a', 'g', 'f', 'e', 'd'};
        for (int index = 0; index < array.length; index++) {
            if (array[index] >= 'A' && array[index] <= 'Z') {
                array[index] = (char) (array[index] + 32);
            }
        }
        for (char ch : array) {
            System.out.print(ch + " ");
        }

    }


}
