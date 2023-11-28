package collectionFramework.listImplementation;

import java.util.ArrayList;
import java.util.function.Predicate;

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
        Predicate<Integer> predicate = integer -> integer % 2 == 0;
        arrayList.removeIf(predicate);
        System.out.println(arrayList);
    }
}

