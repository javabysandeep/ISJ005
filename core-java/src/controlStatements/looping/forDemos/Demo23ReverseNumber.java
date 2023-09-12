package controlStatements.looping.forDemos;

public class Demo23ReverseNumber {
    public static void main(String[] args) {
        int number = 12321;
        int reverse = 0;
        while (number > 0) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number = number / 10;
        }
        System.out.println("Reverse number " + reverse);

    }
}
