package array;

public class Demo21CharacterArrayPalindrome {
    public static void main(String[] args) {
        char[] array = {'d', 'e', 'f', 'g', 'a', 'g', 'f', 'e', 'd'};
        boolean isPalindrome = true;
        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            if (array[left] != array[right]) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }
        System.out.println(isPalindrome ? "Its a palindrome" : "its not a palindrome");
        for (char ch : array) {
            System.out.print(ch + " ");
        }
    }
}
