package classComponents.thisKeyword;

public class LocalInstanceVariable {
    int a = 1;
    static int b = 2;

    public static void main(String[] args) {
        LocalInstanceVariable ref = new LocalInstanceVariable();
        ref.instanceMethod();

        System.out.println("Main method");
        int a = 100;
        int b = 200;
        System.out.println("Local variable " + a);//100
        System.out.println("Instance variable " + ref.a);


        System.out.println("Local variable " + b);//200
        System.out.println("Static variable " + LocalInstanceVariable.b);//2


    }

    void instanceMethod() {
        System.out.println("instance method");
        int a = 100;
        int b = 200;
        System.out.println("Local variable " + a);//100
        System.out.println("Local variable " + b);//200

        System.out.println("Instance variable " + this.a);//1
        System.out.println("Static variable " + LocalInstanceVariable.b);//2
    }
}
