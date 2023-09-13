package controlStatements.looping.whileDemo;

public class Demo7 {
    public static void main(String[] args) {
        int left = 0;
        int right = 5;
        while (left < right) {
            System.out.println(left + "\t" + right);
            left++;
            right--;
        }
        //0  5
        //1  4
        //2  3

    }
}
