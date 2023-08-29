package operators.conditionalOperator;

public class Demo11IsAlphabet {
    public static void main(String[] args) {
        //Program to check if a character is an alphabet or not.
        char ch = 'g';
        System.out.println(
                (ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')
                ? "its alphabet"
                : "its not a alphabet"
        );
    }
}
