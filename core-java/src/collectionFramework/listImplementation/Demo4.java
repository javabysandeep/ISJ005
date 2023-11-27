package collectionFramework.listImplementation;

import java.util.ArrayList;

public class Demo4 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList(); // created a container
        arrayList.add(10);
        arrayList.add("Abc");
        arrayList.add(true);
        arrayList.add(100.50f);
        arrayList.add(null);
        arrayList.add(null);

        //remove elements
        arrayList.remove(0);
        arrayList.remove("Abc");
        System.out.println(arrayList);

        // remove multiple elements
        ArrayList elementsToBeDeleted = new ArrayList();
        elementsToBeDeleted.add(true);
        elementsToBeDeleted.add(100.50f);

        arrayList.removeAll(elementsToBeDeleted);
        System.out.println(arrayList);

        System.out.println("delete all elements from the container");
        arrayList.clear();
        System.out.println(arrayList);
        System.out.println("Size of list "+arrayList.size());

    }
}
