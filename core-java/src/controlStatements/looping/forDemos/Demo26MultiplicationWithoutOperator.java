package controlStatements.looping.forDemos;

public class Demo26MultiplicationWithoutOperator {
    public static void main(String[] args) {
        int number1 = 10;
        int number2 = 5;
        int result = 0;
        for (int i = 1; i <= number1; i++) {
            result = result + number2;
        }
        System.out.println("Multiplication " + result);
    }
}
