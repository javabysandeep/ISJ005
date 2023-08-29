package operators.conditionalOperator;

public class Demo8LeapYear {
    public static void main(String[] args) {
        int year = 2100;
        //leap years: 2000, 2020, 2024
        // not leap years : 2100, 2023,

        boolean isLeapYear = year % 400 == 0 || (year % 100 != 0 && year % 4 == 0);
        System.out.println(isLeapYear ? "its a leap year" : "its not a leap year");

    }
}
