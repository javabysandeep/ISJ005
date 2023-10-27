package array;

public class Demo23Merge {
    public static void main(String[] args) {
        char[] array1 = {'d', 'e', 'f', 'g', 'a', 'g', 'f', 'e', 'd'};
        char[] array2 = {'d', 'e', 'f'};
        int resultArraySize = 0;
        if (array1 != null || array2 != null) {
            resultArraySize = array1.length + array2.length;
        }
        char[] resultArray = new char[resultArraySize];
        int counter = 0;
        for (int index = 0; index < array1.length; index++, counter++) {
            resultArray[counter] = array1[index];
        }

        for (int index = 0; index < array2.length; index++, counter++) {
            resultArray[counter] = array2[index];
        }
        for (char ch : resultArray) {
            System.out.print(ch + " ");
        }

    }
}
