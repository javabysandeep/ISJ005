package controlStatements.conditional;

public class Demo9 {
    public static void main(String[] args) {
        int year = 2023;
        if (year%400==0 || (year % 100 != 0 && year % 4 == 0)) {
            System.out.println("its leap year " + year);
        } else {
            System.out.println("its not a leap year " + year);
        }
    }
}
