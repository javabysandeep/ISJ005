package classComponents.thisKeyword;

public class ProductTest {
    public static void main(String[] args) {
        Product product1 = new Product(1,"Laptop",15400);
        Product product2 = new Product(product1);
    }
}
