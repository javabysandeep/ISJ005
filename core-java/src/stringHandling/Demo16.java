package stringHandling;

public class Demo16 {
    public static void main(String[] args) {
        String str = "some strings are there";
        StringBuilder stringBuilder = new StringBuilder(str);
        StringBuffer stringBuffer = new StringBuffer(str);
        System.out.println(str);
        System.out.println(stringBuilder);
        System.out.println(stringBuffer);

        String str2 = new String(stringBuilder);
        String str3 = new String(stringBuffer);
        //String str4 = stringBuilder;//CTE
        System.out.println(str2);
        System.out.println(str3);
    }
}
