package controlStatements.conditional;

public class Demo12Switch {
    public static void main(String[] args) {
        int value = 10;
        switch (value) {
            case 200 -> System.out.println("Two");
            case 100 -> System.out.println("one");
            case 3 -> System.out.println("Three");
            default -> System.out.println("Invalid input");
        }
    }
}
