package collectionFramework.listImplementation;

import java.util.ArrayList;

public class Demo8 {
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

        strings.set(2, "Abhishek Lambate");
        System.out.println(strings);
    }
}
