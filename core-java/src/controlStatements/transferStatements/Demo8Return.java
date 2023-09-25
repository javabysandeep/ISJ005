package controlStatements.transferStatements;

public class Demo8Return {
    public static void main(String[] args) {
        System.out.println(add(100, 200));
    }

    public static int add(int number1, int number2) {
        return number1 + number2;
        // System.out.println("after return no statement is allowed");
    }
}
