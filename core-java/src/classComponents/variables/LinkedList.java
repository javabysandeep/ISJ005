package classComponents.variables;

public class LinkedList {
    Node head;
    Node tail;

    public static void main(String[] args) {
        Node node1 = new Node();
        Node node2 = new Node();
        Node node3 = new Node();
        Node node4 = new Node();
        Node node5 = new Node();

        node1.data = 10;
        node1.next = node2;

        node2.data = 20;
        node2.next = node3;

        node3.data = 30;
        node3.next = node4;

        node4.data = 40;
        node4.next = node5;

        node5.data = 50;
        node5.next = null;


        LinkedList linkedList = new LinkedList();
        linkedList.head = node1;
        linkedList.tail = node5;
    }
}
