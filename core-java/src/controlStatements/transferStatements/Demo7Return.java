package controlStatements.transferStatements;

public class Demo7Return {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 3) {
                return;
            }
            System.out.println(i);
        }
        System.out.println("rest of the main method");
    }
}
