package controlStatements.looping.whileDemo;

public class Demo6 {
    public static void main(String[] args) {
        int left = 0;
        int right = 5;
        while (left < right) {
            System.out.println(left + "\t" + right);
            left++;
        }
        //0  5
        //1  5
        //2  5
        //3  5
        //4  5
    }
}
