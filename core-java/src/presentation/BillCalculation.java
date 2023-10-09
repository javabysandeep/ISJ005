package presentation;

import java.util.Scanner;

public class BillCalculation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the dish name" );
        String dish=sc.next();
        System.out.println("Enter the quantity");
        int quantity= sc.nextInt();
        System.out.println("Enter the price");
        int price=sc.nextInt();
        System.out.println("you have to add dish");
        int total_price=0;
        int total_dish=0;
        total_dish=total_dish+quantity;
        System.out.println("Total dishes are"+total_dish);
        total_price=total_price+(total_dish*price);
        System.out.println("The total price is "+total_price);
    }

}
