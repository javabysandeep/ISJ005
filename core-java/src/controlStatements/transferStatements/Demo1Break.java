package controlStatements.transferStatements;

public class Demo1Break {
    public static void main(String[] args) {
        //break;
        switch (2) {
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            default:
                System.out.println("invalid input");
                break;
        }
        System.out.println("Rest of the main");
    }
}
