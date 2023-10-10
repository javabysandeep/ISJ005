package oops.encapsulation;

public class ProductTest {
    public static void main(String[] args) {
        Product product = new Product(1, "Mobile", 79999);
        product.setProductId(100);

        System.out.println(product.getProductId());
        System.out.println(product.getProductName());
        System.out.println(product.getProductPrice());

    }
}
