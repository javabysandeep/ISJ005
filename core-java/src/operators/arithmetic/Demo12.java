package operators.arithmetic;

public class Demo12 {
    public static void main(String[] args) {
        int number = 1234;

        int digit = number % 10;
        System.out.println(digit);
        number = number / 10;

        digit = number % 10;
        System.out.println(digit);
        number = number / 10;


        digit = number % 10;
        System.out.println(digit);
        number = number / 10;


        digit = number % 10;
        System.out.println(digit);
        number = number / 10;


    }
}
