package assignments.controlStatements;

import java.util.Scanner;

public class Assignment4 {
    //A company decided to give bonus of 50% to employee if his/her year of service is more than 5 years.
    //Ask user for their salary and year of service and print the net bonus amount.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the salary and years of service");
        double salary = scanner.nextDouble();
        double yearOfService = scanner.nextDouble();
        double bonus = 0.0;
        if (yearOfService > 5) {
            bonus = salary * 0.5;
        }
        System.out.println("Bonus payable " + bonus);
    }
}
