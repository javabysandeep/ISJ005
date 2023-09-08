package controlStatements.conditional;

public class Dem012Switch {
    public static void main(String[] args) {
        int value = 10;
        //byte, short, int, char, String, enum
        switch (value) {
            case 1 : System.out.println("one");break;

            case 2: System.out.println("Two");break;

            case 3:  System.out.println("Three");break;

            default:  System.out.println("Invalid input");break;
        }
    }
}
