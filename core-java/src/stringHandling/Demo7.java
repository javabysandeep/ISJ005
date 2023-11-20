package stringHandling;

public class Demo7 {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "xyz";
        System.out.println(str1 + str2);//+ operator
        System.out.println(str1.concat(str2));//concat() method

        str1 = str1.concat(str2);

        System.out.println(str1);//abcxyz
        System.out.println(str2);//xyz

    }
}
