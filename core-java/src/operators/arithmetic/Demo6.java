package operators.arithmetic;

public class Demo6 {
    public static void main(String[] args) {
        System.out.println('A' + "A" + 65);//AA65

        System.out.println(10 + 20 + "10" + 20);//301020

        System.out.println('A' + 'A' + "A");//130A

        System.out.println('A' + "A" + 'A' + 'A');//AAAA

        System.out.println('A' + "A" + "A" + 'A');//AAAA
    }
}
