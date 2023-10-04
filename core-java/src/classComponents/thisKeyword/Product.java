package classComponents.thisKeyword;

public class Product {
    int productId;
    String productName;
    int productPrice;

    //zero parameterized or no-args constructor
    public Product() {
    }

    //all-args constructor or parameterized constructor
    public Product(int productId, String productName, int productPrice) {
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
    }

    //copy constructor
    public Product(Product product) {
        this.productId = product.productId;
        this.productName = product.productName;
        this.productPrice = product.productPrice;
    }
}
