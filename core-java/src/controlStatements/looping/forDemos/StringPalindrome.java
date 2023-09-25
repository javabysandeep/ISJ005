package controlStatements.looping.forDemos;

public class StringPalindrome {
    public static void main(String[] args) {
        char[] charArray = {'h', 'e', 'l', 'l', 'o'};
        int left = 0;
        int right = charArray.length - 1;
        while (left < right) {
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            left++;
            right--;
        }

        for (char ch : charArray) {
            System.out.print(ch);
        }
    }
}
