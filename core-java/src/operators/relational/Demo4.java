package operators.relational;

public class Demo4 {
    public static void main(String[] args) {
        int year = 2020;
        System.out.println(year % 400 == 0);//false
        System.out.println(year % 4 == 0);//true
        System.out.println(year % 100 != 0);//true

        //2020 % 400
        //20 == 0
    }
}
