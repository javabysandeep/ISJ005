package classComponents.thisKeyword;

public class B {
    public static void main(String[] args) {
        A a = new A();
        a.m1();

        A.m2();
        a.m2();
    }
    public void display(){
        A a = new A();
        a.m1();

        A.m2();
        a.m2();
    }
}
