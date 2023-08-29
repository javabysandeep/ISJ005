package operators.conditionalOperator;

public class Demo7MinOfThreeNumbers {
    public static void main(String[] args) {
        int number1 = 1090;
        int number2 = 190;
        int number3 = 109;
        System.out.println("Minimum of three numbers " + (
                number1 < number2 && number1 < number3 ? number1 :
                        number2 < number1 && number2 < number3 ? number2 : number3)
        );
    }
}
