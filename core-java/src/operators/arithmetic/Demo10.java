package operators.arithmetic;

public class Demo10 {
    public static void main(String[] args) {
        int a = 10;//a = 10
        a = a + 20; //a = 30
        a = a + 20; //a=50
        a = a + 20; //a=70
        a = a + 20; //a=90
        System.out.println(a);//90

        int b = 10; //b=10
        b += 10; //b =20
        b += 20; // b=40
        b += 20; // b=60
        b += 20; //b =80
        b += 20; //b = 100
        System.out.println(b);//100
    }
}
