package operators.logicalOperators;

public class Demo4 {
    public static void main(String[] args) {
        int year = 2023;
        System.out.println(year % 400 == 0);//false
        System.out.println(year % 100 != 0);//true
        System.out.println(year % 4 == 0);//false
        System.out.println(
                (year % 400 == 0) ||
                   ( (year % 100 != 0) && (year % 4 == 0))
        );//false
    }
}
