package collectionFramework.introduction;

public class Demo3 {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};
        int[] newArray = new int[2* array.length];
        for (int index = 0; index < array.length; index++) {
            newArray[index]= array[index];
        }
        array= newArray;
        array[5]= 100;
        for (int temp:array) {
            System.out.println(temp);
        }
    }
}
