package collectionFramework.listImplementation;

import java.util.ArrayList;

public class Demo3 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList(); // created a container
        arrayList.add(10);
        arrayList.add("Abc");
        arrayList.add(true);
        arrayList.add(100.50f);
        arrayList.add(null);
        arrayList.add(null);


        ArrayList arrayList2 = new ArrayList();
        arrayList2.addAll(arrayList);
        arrayList2.add("at the end some values");
        System.out.println(arrayList2);


    }
}
