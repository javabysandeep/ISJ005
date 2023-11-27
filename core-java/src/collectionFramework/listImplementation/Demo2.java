package collectionFramework.listImplementation;

import java.util.ArrayList;

public class Demo2 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList(); // created a container

        // we can add duplicates, null, insertion order is maintained
        //add the element and append
        arrayList.add(10);
        arrayList.add("Abc");
        arrayList.add(true);
        arrayList.add(100.50f);
        arrayList.add(null);
        arrayList.add(null);

        //add the element at specified index
        arrayList.add(0,"Element added at the beginning");

        //printing the arraylist content
        System.out.println(arrayList);

        //creating a container using existing one
        ArrayList newContainer = new ArrayList(arrayList);
        System.out.println(newContainer);
        System.out.println("size of the container "+newContainer.size());
        System.out.println("Is the container empty "+newContainer.isEmpty());


        //creating container with a initial capacity
        ArrayList arrayList3 = new ArrayList(100);

    }
}
