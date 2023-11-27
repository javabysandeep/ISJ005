package collectionFramework.listImplementation;

import java.util.ArrayList;

public class Demo6 {
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
        strings.removeIf(str -> str.startsWith("A") && str.endsWith("t"));
        System.out.println(strings);
    }
}
