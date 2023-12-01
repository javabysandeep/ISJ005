package collectionFramework.queueImplementation;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Demo3 {
    public static void main(String[] args) {
       // Priority --> integers asc order
        Queue<Integer> queue = new PriorityQueue<>();

        queue.add(1000);
        queue.add(20);
        queue.add(40);
        queue.add(9);
        queue.add(50);
        //50 --->9-->40-->20--->10
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
    }
}
