package array;

public class Demo20CharacterArrayReverse {
    public static void main(String[] args) {
        char[] array = {'d', 'e', 'f', 'g', 'a', 'g', 'f', 'e', 'd'};

      /*  //way 1 : printing from max to min index
        for (int index = array.length - 1; index >= 0; index--) {
            System.out.print(array[index] + " ");
        }
        // way 2 : create new array and copy the content
        char[] array2 = new char[array.length];
        for (int index = array.length - 1, index2 = 0; index >= 0; index--, index2++) {
            array2[index2] = array[index];
        }*/

        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            char temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
        for (char ch : array) {
            System.out.print(ch + " ");
        }
    }
}
