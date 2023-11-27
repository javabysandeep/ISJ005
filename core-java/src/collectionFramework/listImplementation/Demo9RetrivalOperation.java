package collectionFramework.listImplementation;

import java.util.ArrayList;

public class Demo9RetrivalOperation {
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

        //way 1. all the elements
        System.out.println("Printing the reference");
        System.out.println(list);

        //way 2: traditional for loop
        System.out.println("Traditional for loop");
        for (int index = 0; index < list.size(); index++) {
            System.out.print(list.get(index) + " ");
        }

        //way 3: enhanced for loop
        System.out.println("\n enhanced for loop");
        for (String str : list) {
            System.out.print(str + " ");
        }


        //way 4: using java 8
        System.out.println("\n Using Java 8 foreach");
        list.forEach(System.out::println);
    }
}
