package oops.java8Features.lambdaExpression;

public interface C {
    String provide();

    public static void main(String[] args) {
        //way 1: traditional way
        class CImpl implements C {
            @Override
            public String provide() {
                return "Dummy string : traditional";
            }
        }
        C c = new CImpl();
        System.out.println(c.provide());

        //way 2 : anonymous class way
        C c2 = new C() {
            @Override
            public String provide() {
                return "Dummy string : anonymous class";
            }
        };
        System.out.println(c2.provide());

        //way 3 : Lambda expression way
        C c3 = () -> "Dummy string : Lambda expression";
        System.out.println(c3.provide());
    }
}
