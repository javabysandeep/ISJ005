package classComponents.variables;

public class LocalVariable {
    int a = 100;
    static int b = 200;

    public static void main(String[] args) {
        int localVariable = 100;
        System.out.println(localVariable);

        int a = 1000;
        int b = 2000;
        System.out.println(a);//1000 --> LV
        System.out.println(b);//2000 -->LV

        LocalVariable ref = new LocalVariable();
        System.out.println("Instance variable " + ref.a);
        System.out.println("Static variable " + LocalVariable.b);
    }
}
