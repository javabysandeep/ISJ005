package operators.incrementDecrement;

public class Demo4 {
    public static void main(String[] args) {
        int a = 10;
        int b = ++a;//a=11
        int c = a--;//c =11,a=10
        int d = a++; //d = 10, a=11
        int e = --a;//a=10, e=10

        System.out.println(a);//10
        System.out.println(b);//11
        System.out.println(c);//11
        System.out.println(d);//10
        System.out.println(e);//10

    }
}
