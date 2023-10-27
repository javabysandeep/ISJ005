package array;

public class Demo25ToUpperCase {
    public static void main(String[] args) {
        char[] array = {'d', 'e', 'f', 'g', 'a', 'g', 'f', 'e', 'd'};
        for (int index = 0; index < array.length; index++) {
            if (array[index] >= 'a' && array[index] <= 'z') {
                array[index] = (char) (array[index] - 32);
            }
        }
        for (char ch : array) {
            System.out.print(ch + " ");
        }

    }


}
