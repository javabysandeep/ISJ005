package classComponents.constructor;

import java.util.Scanner;

public class Product {
    int productId;
    String productName;
    int productPrice;

    //zero parameterized or no args constructor
    Product() {

    }

    //parameterized constructor  or all args constructor
    Product(int pId, String pName, int pPrice) {
        productId = pId;
        productName = pName;
        productPrice = pPrice;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the product id");
        int productId = scanner.nextInt();

        System.out.println("enter the product price");
        int productPrice = scanner.nextInt();

        System.out.println("enter the product name");
        String productName = scanner.nextLine();

        Product product = new Product(productId, productName, productPrice);
        System.out.println("Product --> " + product.productId + "\t" + product.productName + "\t" + product.productPrice);

    }
}
