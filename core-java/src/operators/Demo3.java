package operators;

public class Demo3 {
    public static void main(String[] args) {
        int number = 12345;
        System.out.println(number % 10);//5

        number /= 10;
        System.out.println(number % 10);//4

        number /= 10;
        System.out.println(number % 10);//3

        number /= 10;
        System.out.println(number % 10);//2

        number /= 10;
        System.out.println(number % 10);//1


    }
}
