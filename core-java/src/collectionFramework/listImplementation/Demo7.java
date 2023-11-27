package collectionFramework.listImplementation;

import java.util.ArrayList;

public class Demo7 {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("Pruthvi");
        strings.add("Omkar");
        strings.add("Abhishek");
        strings.add("Avadhut");
        strings.add("Ganesh");
        strings.add("Hrushikesh");
        strings.add("Vaibhav");
        strings.add("Swapnil");
        System.out.println(strings.contains("Abhishek"));
        System.out.println(strings.contains("Avishek"));

        ArrayList<String> searchList = new ArrayList<>();
        searchList.add("Ganesh");
        searchList.add("Vaibhav");
        searchList.add("Swapnil");
        searchList.add("xxxxx");

        System.out.println("List element search: " + strings.containsAll(searchList));
    }
}
