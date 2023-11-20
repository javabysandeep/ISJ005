package stringHandling;

public class Demo8 {
    public static void main(String[] args) {
        String str = "abc";
        str = str.toUpperCase();
        System.out.println(str);//ABC

        String str2 = "Hello, We are learning string handling";
        str2 = str2.replace("a", "@");
        System.out.println(str2);


        String str3 = "            some strings are with spaces      ";
        str3 = str3.trim();
        System.out.println(str3);


        String s1 = new String("abc");
        String s2 = "abc";
        String s3 = "abc";
        System.out.println(s1 == s2);//false
        System.out.println(s2 == s3);//true --> reference check


        System.out.println(s1.equals(s2));//true
        System.out.println(s1.equals(s3));//true
        System.out.println(s2.equals(s3));//true

        String s4 = "ABC";
        System.out.println(s1.equals(s4));//false
        System.out.println(s1.equalsIgnoreCase(s4));//true

        System.out.println(s4.charAt(0));//A

        char[] chars = s4.toCharArray();
        for (char ch : chars) {
            System.out.print(ch + "\t");
        }


    }
}
