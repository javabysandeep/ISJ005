package array;

public class Demo27ReplaceCharacter {
    public static void main(String[] args) {
        char[] array = {'a', 'b', 'c', 'a', 'a', 'g', 'a', 'e', 'd'};
        for (int index = 0; index < array.length; index++) {
            if (array[index] == 'a') {
                array[index] = 'z';
            }
        }
        for (char ch : array) {
            System.out.print(ch + " ");
        }

    }


}
