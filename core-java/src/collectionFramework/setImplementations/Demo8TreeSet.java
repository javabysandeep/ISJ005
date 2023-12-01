package collectionFramework.setImplementations;

import java.util.TreeSet;

public class Demo8TreeSet {
    public static void main(String[] args) {
        // null is not allowed even once-->NPE
        // elements must be homogeneous
        //unique
        //sorting
        TreeSet treeSet = new TreeSet();
        treeSet.add(100);
        treeSet.add(50);
        treeSet.add(100);
        treeSet.add(200);
        treeSet.add(200);
        // treeSet.add(null);
        //treeSet.add(null);
        // treeSet.add("abc");
        //treeSet.add(10.5);
        System.out.println(treeSet);
    }
}
