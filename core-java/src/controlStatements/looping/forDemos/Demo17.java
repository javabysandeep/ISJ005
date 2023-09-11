package controlStatements.looping.forDemos;

public class Demo17 {
    public static void main(String[] args) {
        int left = 0;
        int right = 10;
        for (; left < right; ) {
            System.out.println(left + "\t" + right);
        }
        //output: 0, 10...
    }
}
