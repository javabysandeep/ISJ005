package stringHandling;

public class Demo14 {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("StringBuilder is a mutable class");
        stringBuilder.append(" hello");
        stringBuilder.insert(0, "hi ");
        stringBuilder.reverse();
        stringBuilder.deleteCharAt(0);
        System.out.println(stringBuilder);
    }
}
