package collectionFramework.setImplementations;

import java.util.HashSet;

public class Demo4 {
    public static void main(String[] args) {
        //unique, no SO, no IO
        HashSet<Integer> integers = new HashSet<>();
        integers.add(100);
        integers.add(200);
        integers.add(300);
        integers.add(300);
        integers.add(200);
        integers.add(500);
        System.out.println(integers);
    }
}
