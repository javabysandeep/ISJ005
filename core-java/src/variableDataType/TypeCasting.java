package variableDataType;

public class TypeCasting {
    public static void main(String[] args) {
        byte b = 100;
        int p = (int) b;//implicit typecasting
        // assigning smaller data type value to a bigger data type value.
        // there won't be any data loss

        int integerValue = 130;
        byte byteValue = (byte) integerValue;
        System.out.println("Byte value " + byteValue);

        int m = 100;
        int n = 200;
        byte result = (byte) (m + n);
        System.out.println(m + n);

        float fl = 102.56f;
        int i = (int) fl;
        System.out.println(i);

    }
}
