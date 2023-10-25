package array;

public class Demo9LinearSearch {
    public static void main(String[] args) {
        int[] values = {11, 33, 50, 44, 78};
        int key = 50;
        int key2 = 44;
        boolean isFound1 = false;
        boolean isFound2 = false;
        for (int index = 0; index < values.length; index++) {
            if (values[index] == key) {
                isFound1 = true;
               // break;
            }
            if (values[index] == key2) {
                isFound2 = true;
              //  break;
            }
        }
        System.out.println(isFound1 ? " key 1 found" : "key 2 not found");
        System.out.println(isFound2 ? " key 2 found" : "key 2 not found");
    }
}
