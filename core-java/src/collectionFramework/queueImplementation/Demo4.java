package collectionFramework.queueImplementation;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.TreeSet;

public class Demo4 {
    public static void main(String[] args) {
        // Priority --> integers asc order
        Queue<String> queue = new PriorityQueue<>();
        queue.add("Yash");
        queue.add("Hrishkesh");
        queue.add("Hrishkesh");
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
