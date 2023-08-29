package operators.conditionalOperator;

public class Demo6MaxOfThreeNumbers {
    public static void main(String[] args) {
        int number1 = 10;
        int number2 = 190;
        int number3 = 109;
        System.out.println(
                (number1 > number2 && number1 > number3)
                        ? (number1)
            : ( number2>number1 && number2>number3 ? number2 : number3  )

        );
    }
}
