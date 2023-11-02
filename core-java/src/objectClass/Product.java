package objectClass;

public class Product implements Cloneable{
    private int productId;
    private String productName;
    private int productPrice;

    public Product(int productId, String productName, int productPrice) {
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
    }

    @Override
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object == null) {
            return false;
        }
        Product product = (Product) object;
        return this.productId == product.productId;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                '}';
    }

    public static void main(String[] args) {
        Product product1 = new Product(101, "mobile", 41000);
        Product product2 = new Product(101, "mobile", 41000);
        System.out.println(product1 == product2);//false
        System.out.println(product1.equals(product2));//true
        System.out.println(product1.equals(product1));//true
        System.out.println(product1.equals(null));//false
    }
}
