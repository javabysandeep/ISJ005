package array;

public class Demo22ArrayEqualityCheck {
    public static void main(String[] args) {
        char[] array1 = {'d', 'e', 'f', 'g', 'a', 'g', 'f', 'e', 'd'};
        char[] array2 = {'d', 'e', 'f', 'g', 'a', 'g', 'f', 'h', 'd'};
        System.out.println(isEqual(array1, array2) ? "Arrays are equal" : "arrays are not equal");
    }

    public static boolean isEqual(char[] array1, char[] array2) {
        boolean isEqual = true;
        if (array1 == null || array2 == null) {
            return false;
        }

        if (array1.length != array2.length) {
            return false;
        }

        for (int index = 0; index < array1.length; index++) {
            if (array1[index] != array2[index]) {
                return false;
            }
        }
        return isEqual;
    }

    public static boolean isEmpty(char[] array) {
        return array == null || array.length == 0 ? true : false;
    }


}
