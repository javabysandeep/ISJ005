package stringHandling;

public class Demo17 {
    public static void main(String[] args) {
        //default capacity is 16
        StringBuffer stringBuffer = new StringBuffer("abc");

        System.out.println("Capacity " + stringBuffer.capacity());//19
        System.out.println("Length " + stringBuffer.length());//3

        //capacity specified
        StringBuffer stringBuffer1 = new StringBuffer(10);
        stringBuffer1.append("capacity planning and control");
        System.out.println("Capacity " + stringBuffer1.capacity());//100
        System.out.println("Length " + stringBuffer1.length());//~30

    }
}
