package collectionFramework.listImplementation;

import java.util.Stack;

public class Demo17Stack {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(100);
        stack.push(30);
        stack.push(150);
        stack.push(10);
        stack.push(1);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
