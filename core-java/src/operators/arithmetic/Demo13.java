package operators.arithmetic;

public class Demo13 {
    public static void main(String[] args) {
        int number = 1234567890;
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            //System.out.println(digit);
            sum = sum + digit;
            number = number / 10;
        }
        System.out.println("sum of digits "+sum);
    }
}
