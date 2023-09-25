package commandLineArguments;

public class Demo3 {
    public static void main(String[] args) {
        for (int index = 0; index < args.length; index++) {
            int number = Integer.parseInt(args[index]);
            System.out.println(number * number);
        }
        m1();
    }

    public static void m1(){
        m2();
    }
    public static void m2(){
        m3();
    }
    public static void m3(){}

}
