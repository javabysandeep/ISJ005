package controlStatements.looping.forDemos;

public class Demo16 {
    public static void main(String[] args) {
        for (int i = 10; i >= 0; i++) {
            System.out.println(i);
            i = i - 2;
        }
        //10,9,8, 7, 6, 5, 4, 3, 2, 1,0
    }
}
