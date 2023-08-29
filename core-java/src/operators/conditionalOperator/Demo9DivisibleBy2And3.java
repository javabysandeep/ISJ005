package operators.conditionalOperator;

public class Demo9DivisibleBy2And3 {
    public static void main(String[] args) {
        //Program to check if a number is divisible by both 2 and 3.
        int number = 15;
        System.out.println((number % 2 == 0 && number % 3 == 0) ?
                "its divisible by 2 & 3" :
                "its not divisible by 2 & 3");
    }
}
