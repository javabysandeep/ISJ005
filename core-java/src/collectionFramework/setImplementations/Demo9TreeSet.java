package collectionFramework.setImplementations;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Demo9TreeSet {
    public static void main(String[] args) {
        TreeSet treeSet = new TreeSet();
        treeSet.add(100);
        treeSet.add(10);
        treeSet.add(20);
        treeSet.add(300);
        treeSet.add(200);

        System.out.println("using iterator");
        Iterator iterator = treeSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("using java 8 foreach");
        treeSet.forEach(System.out::println);

        System.out.println("using for each");
        for (Object obj : treeSet) {
            System.out.println(obj);
        }

    }
}
