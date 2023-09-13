package controlStatements.looping.whileDemo;

import java.util.Scanner;

public class BillCalculator {
    public static void main(String[] args) {
        System.out.println("***************** Welcome to Bill Calculator System **********");
        Scanner scanner = new Scanner(System.in);
        int totalBill = 0;
        int totalQuantity = 0;
        char ch = 'Y';
        while (ch != 'N') {
            System.out.println("Enter the Product Name");
            String productName = scanner.next();

            System.out.println("Enter the Product Price");
            int productPrice = scanner.nextInt();

            System.out.println("Enter the Product Quantity");
            int productQuantity = scanner.nextInt();

            totalBill += productPrice * productQuantity;
            totalQuantity += productQuantity;

            System.out.println("Product Name " + productName + "\t Product Price " + productPrice + "\t Product Quantity " + productQuantity);

            System.out.println("Do you want to continue");
            ch = scanner.next().charAt(0);
        }

        System.out.println("Total bill Amount = " + totalBill + "\t Total Quantity = " + totalQuantity);
    }
}
