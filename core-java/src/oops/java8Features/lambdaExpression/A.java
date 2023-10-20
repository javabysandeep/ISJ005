package oops.java8Features.lambdaExpression;

public interface A {
    void m1();

    public static void main(String[] args) {
        //way 1 : traditional way
        class AImpl implements A {
            @Override
            public void m1() {
                System.out.println("m1 method");
            }
        }
        A a = new AImpl();
        a.m1();

        //way 2 : anonymous way
        A a1 = new A() {
            @Override
            public void m1() {
                System.out.println("m1 method");
            }
        };
        a1.m1();

        //way 3 : Lambda expression way
        A a2 = () -> System.out.println("m1 method:lambda expression");
        a2.m1();

    }
}
