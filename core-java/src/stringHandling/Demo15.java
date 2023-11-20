package stringHandling;

public class Demo15 {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("StringBuffer is a mutable class");
        stringBuffer.append(" hello");
        stringBuffer.insert(0, "hi ");
        stringBuffer.reverse();
        stringBuffer.deleteCharAt(0);
        System.out.println(stringBuffer);

        //StringBuffer sb1 = "abc";
        //StringBuilder sb2 = "abc";
    }
}
