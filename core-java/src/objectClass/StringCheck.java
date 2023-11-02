package objectClass;

public class StringCheck {
    public static void main(String[] args) {
        String str1 = new String("abc");
        String str2 = new String("abc");
        String str3 = "abc";
        String str4 = "abc";

        System.out.println(str1 == str2);//false
        System.out.println(str3 == str4);//true
        System.out.println(str1 == str4);//false

        System.out.println(str1.equals(str4));//true
    }
}
