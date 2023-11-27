package collectionFramework.listImplementation;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo10RetrivalOperation {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Pruthvi");
        list.add("Omkar");
        list.add("Abhishek");
        list.add("Avadhut");
        list.add("Ganesh");
        list.add("Hrushikesh");
        list.add("Vaibhav");
        list.add("Swapnil");

        //way 5 : using Iterator
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
