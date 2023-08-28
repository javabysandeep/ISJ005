package operators.bitwise;

public class Demo2 {
    public static void main(String[] args) {
        //bitwise operators :  &, |, ^, ~, <<, >>, >>>
        System.out.println(4 & 5);//4
        System.out.println(4 | 5);//5
        System.out.println(4 ^ 5);//1
        System.out.println(~4);//-5
        System.out.println(~-6);// 5

        System.out.println(4 << 1); //8
        System.out.println(4 << 2); //16
        System.out.println(4 << 3); //32

        System.out.println("Right shift");
        System.out.println(4 >> 1); //2
        System.out.println(4 >> 2); //1
        System.out.println(4 >> 3); //0

         System.out.println(4 >>> 1); //2
        System.out.println(4 >>> 2); //1
        System.out.println(4 >>> 3); //0

    }
}
