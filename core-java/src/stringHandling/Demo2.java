package stringHandling;

public class Demo2 {
    public static void main(String[] args) {
        String str = "abc";
        System.out.println("Length of the String " + str.length());//3

        String str2 = "xyz";
        System.out.println(str + str2);

        String concat = str.concat(str2);
        System.out.println(concat);
        System.out.println("this is the string".toUpperCase());
        System.out.println("THIS IS THE STRING".toLowerCase());
    }
}
