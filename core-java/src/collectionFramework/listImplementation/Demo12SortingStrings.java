package collectionFramework.listImplementation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo12SortingStrings {
    public static void main(String[] args) {
        List arrayList = new ArrayList();
        arrayList.add("abc");
        arrayList.add("pqr");
        arrayList.add("mnp");
        arrayList.add("efg");

        Collections.sort(arrayList);
        System.out.println(arrayList);

    }
}
