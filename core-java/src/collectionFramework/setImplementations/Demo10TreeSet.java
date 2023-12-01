package collectionFramework.setImplementations;

import java.util.TreeSet;

public class Demo10TreeSet {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Yash");
        treeSet.add("Hrishkesh");
        treeSet.add("Hrishkesh");
        treeSet.add("Hrishkesh");
        treeSet.add("Akshay");
        treeSet.add("Ganesh");
        treeSet.add("Swapnil");
        treeSet.add("Abhishek");
        treeSet.add("Omkar");
        treeSet.add("Vaibhav");
        treeSet.add("Shamal");
        treeSet.add("Gayatri");
        treeSet.add("Pratiskha");

        treeSet.forEach(System.out::println);

    }
}
