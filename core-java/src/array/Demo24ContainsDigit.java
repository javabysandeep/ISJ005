package array;

public class Demo24ContainsDigit {
    public static void main(String[] args) {
        char[] array = {'d', 'e', '5', 'g', 'a', 'g', 'f', 'e', 'd'};
        System.out.println(containsDigit(array) ? "contains digit" : "does not contain digit");
    }

    public static boolean containsDigit(char[] array) {
        boolean containsDigit = false;
        for (char ch : array) {
            if (ch >= '0' && ch <= '9') {
                return true;
            }
        }
        return containsDigit;
    }
}
