package classComponents.thisKeyword;

public class A {
    void m1() {
        System.out.println("A : instance method m1");
    }

    static void m2() {
        System.out.println("A : static method m2");
    }

    public static void main(String[] args) {
        A a = new A();
        a.m1();

        A.m2();
        m2();
        a.m2();
    }

    public void instanceMethod(){
        m1();
        this.m1();

        A.m2();
        m2();
        this.m2();
    }
}
