package objectClass;

public class HashCodeMethod {
    public static void main(String[] args) {
        Product product1 = new Product(1, "abc", 400);
        Product product2 = new Product(1, "abc", 400);

        System.out.println(product1.hashCode());
        System.out.println(product2.hashCode());
    }
}
