package collectionFramework.queueImplementation;

import java.util.LinkedList;
import java.util.Queue;

public class Demo1 {
    public static void main(String[] args) {
        //FIFO
        Queue<Integer> integers = new LinkedList<>();
        //1. add
        System.out.println(integers.add(10));//null
        System.out.println(integers.offer(100));//exception
        //2. remove
        System.out.println(integers.poll());//null
        //System.out.println(integers.remove());//exception
        //3. inspect
        System.out.println(integers.peek());//null
        System.out.println(integers.element());//exception
    }
}
