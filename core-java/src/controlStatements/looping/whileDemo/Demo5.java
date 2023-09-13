package controlStatements.looping.whileDemo;

public class Demo5 {
    public static void main(String[] args) {
        int left = 0;
        int right = 5;
        while (left < right) {
            System.out.println(left + "\t" + right);
        }
        //0  5
        //0  5
        //....
    }
}
