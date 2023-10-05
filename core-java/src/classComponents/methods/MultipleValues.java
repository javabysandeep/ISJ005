package classComponents.methods;

public class MultipleValues {
    public static void main(String[] args) {
        display(new String[]{
                "abc", "xyz", "pqr"
        });
    }

    public static void display(String[] input) {
        for (String str : input) {
            System.out.println(str);
        }
    }
}
