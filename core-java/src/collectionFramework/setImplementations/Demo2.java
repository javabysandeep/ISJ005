package collectionFramework.setImplementations;

import java.util.HashSet;
import java.util.Set;

public class Demo2 {
    public static void main(String[] args) {
        // unique, heterogeneous, null(1), no iO
        Set set = new HashSet();
        set.add(100);
        set.add(100);
        set.add(200);
        set.add(200);
        set.add(null);
        set.add(null);
        set.add("abc");
        set.add(10.5);
        System.out.println(set);
        set.remove(100);
        System.out.println(set);
        //set.clear();
        System.out.println(set);
        System.out.println(set.contains("abc"));
        System.out.println("size "+set.size());
    }
}
