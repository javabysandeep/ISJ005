package classComponents.blocks;

public class Order {
    static int orderCount = 0;

    {
        orderCount++;
    }

    public static void main(String[] args) {
        Order order1 = new Order();
        Order order2 = new Order();
        Order order3 = new Order();
        Order order4 = new Order();
        Order order5 = new Order();
        System.out.println("total order object created " + Order.orderCount);//5
    }
}
