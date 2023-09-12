package controlStatements.looping.forDemos;

public class Demo23ReverseNumberPalindrome {
    public static void main(String[] args) {
        int number = 123212;
        int oldNumber = number;
        int reverse = 0;
        while (number > 0) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number = number / 10;
        }
        System.out.println("Reverse number " + reverse);
        System.out.println(oldNumber == reverse ? "Palindrome" : "not a palindrome");

    }
}
