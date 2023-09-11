package assignments.controlStatements;

import java.util.Scanner;

public class Assignment3 {
    /*
    *

    A shop will give discount of 10% if the cost of purchased quantity is more than 1000.
        Ask user for quantity
      accept unit cost
        Judge and print total cost for user.
    * */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the quantity and costPerUnit per unit ");
        int quantity = scanner.nextInt();
        double costPerUnit = scanner.nextDouble();
        double totalCost = quantity * costPerUnit;
        double discount = 0;
        if (quantity > 1000) {
            discount = totalCost * 0.1;
        }
        System.out.println("Total payable amount : " + (totalCost - discount));
    }
}
