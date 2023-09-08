package controlStatements.conditional;

public class Demo7 {
    public static void main(String[] args) {
        int number1 = 1000;
        int number2 = 220;
        int number3 = 2200;

        if (number1 > number2 && number1 > number3) {
            System.out.println(number1);
        } else if (number2 > number1 && number2 > number3) {
            System.out.println(number2);
        } else {
            System.out.println(number3);
        }


    }
}
