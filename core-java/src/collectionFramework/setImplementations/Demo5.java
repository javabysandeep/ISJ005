package collectionFramework.setImplementations;

import java.util.HashSet;

public class Demo5 {
    public static void main(String[] args) {
        //unique, no SO, no IO
        HashSet<String> strings = new HashSet<>();
        strings.add("chetan");
        strings.add("chetan");
        strings.add("abhishek");
        strings.add("abhishek");
        strings.add("mohan");
        strings.add("mohan");
        strings.add("vaibhav");
        strings.add("vaibhav");
        strings.add("sujay");
        strings.add("sujay");
        System.out.println(strings);
    }
}
