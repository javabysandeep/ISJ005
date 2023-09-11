package controlStatements.looping.forDemos;

public class Demo18 {
    public static void main(String[] args) {
        int left = 0;
        int right = 10;
        for (; left < right; ) {
            System.out.println(left + "\t" + right);
            left++;
            right--;
        }
        //0 10
        //1 9
        //2 8
        //3 7
        //4 6
    }
}
