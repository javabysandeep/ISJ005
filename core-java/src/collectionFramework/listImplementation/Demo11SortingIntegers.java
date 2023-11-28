package collectionFramework.listImplementation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo11SortingIntegers {
    public static void main(String[] args) {
        List arrayList = new ArrayList();
        arrayList.add(10);
        arrayList.add(1);
        arrayList.add(40);
        arrayList.add(2);
       // arrayList.add("abc");
        Collections.sort(arrayList);
        System.out.println(arrayList);

    }
}
