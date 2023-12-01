package collectionFramework.queueImplementation;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Demo5 {
    public static void main(String[] args) {
        // Priority --> integers asc order
        Comparator<String> comparator = (str1, str2) -> str2.length() - str1.length();
        Queue<String> queue = new PriorityQueue<>(comparator);
        queue.add("Yash");
        queue.add("Hrishkesh");
        queue.add("Akshay");
        queue.add("Ganesh");
        queue.add("Swapnil");
        queue.add("Abhishek");
        queue.add("Omkar");
        queue.add("Vaibhav");
        queue.add("Shamal");
        queue.add("Gayatri");
        queue.add("Pratiskha");
        int queueSize = queue.size();
        for (int i = 1; i <= queueSize; i++) {
            System.out.println(queue.poll());
        }
    }
}
