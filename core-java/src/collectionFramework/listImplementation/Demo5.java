package collectionFramework.listImplementation;

import java.util.ArrayList;

public class Demo5 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList();
        //arrayList.add("abc");
        arrayList.add(10);
        arrayList.add(11);
        arrayList.add(12);
        arrayList.add(13);
        arrayList.add(14);
        arrayList.add(15);
        arrayList.add(16);
        arrayList.removeIf(integer -> integer % 2 == 0);
        System.out.println(arrayList);
    }
}

