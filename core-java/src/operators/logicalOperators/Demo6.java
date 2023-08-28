package operators.logicalOperators;

public class Demo6 {
    public static void main(String[] args) {
        int number1 = 100;
        int number2 = 200;
        int number3 = 300;
        System.out.println(number1 > number2 && number1 > number3);//false
        System.out.println(number2 > number1 && number2 > number3);//false
        System.out.println(number3 > number1 && number3 > number2);//true


    }
}
