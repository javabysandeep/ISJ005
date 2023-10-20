package oops.java8Features.lambdaExpression;

public interface B {
    void accept(int number);

    public static void main(String[] args) {
        //way1 : traditional way
        class BImpl implements B {
            @Override
            public void accept(int number) {
                System.out.println("Number is " + number);
            }
        }
        B b = new BImpl();
        b.accept(100);


        //way2 : anonymous class way
        B b1 = new B() {
            @Override
            public void accept(int number) {
                System.out.println("Anonymous number " + number);
            }
        };
        b1.accept(200);


        //way3 : lambda expression way
        B b2 = number -> System.out.println("Lambda expression number " + number);
        b2.accept(300);

    }
}
