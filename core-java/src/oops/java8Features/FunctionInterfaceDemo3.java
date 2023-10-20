package oops.java8Features;

import java.util.function.Predicate;

public class FunctionInterfaceDemo3 {
    public static void main(String[] args) {
        //way 1 : traditional way to create subclass of functional interface
        class PredicateImpl implements Predicate {
            @Override
            public boolean test(Object o) {
                return false;
            }
        }
        Predicate predicate = new PredicateImpl();
        System.out.println(predicate.test(10));

        //way 2 : anonymous class  way to create subclass of functional interface
        Predicate predicate2 = new Predicate() {
            @Override
            public boolean test(Object o) {
                return false;
            }
        };
        System.out.println(predicate2.test(10));


    }
}
