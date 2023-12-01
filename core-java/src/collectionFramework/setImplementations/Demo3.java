package collectionFramework.setImplementations;

import java.util.*;

public class Demo3 {
    public static void main(String[] args) {
        // unique, heterogeneous, null(1), no iO
        HashSet hashSet = new HashSet();
        hashSet.add(100);
        hashSet.add(100);
        hashSet.add(200);
        hashSet.add(200);
        hashSet.add(null);
        hashSet.add(null);
        hashSet.add("abc");
        hashSet.add(10.5);

        //System.out.println(hashSet.get());
        Iterator iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("using java 8 way");
        hashSet.forEach(System.out::println);


        System.out.println("foreach");
        for (Object obj : hashSet) {
            System.out.println(obj);
        }

        //index concept is not there
        for (int i = 1; i <= hashSet.size(); i++) {
            //System.out.println(hashSet.);
        }

    }
}
