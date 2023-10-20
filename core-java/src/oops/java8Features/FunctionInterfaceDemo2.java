package oops.java8Features;

public class FunctionInterfaceDemo2 {
    public static void main(String[] args) {
        //Runnable, Callable, Function, Predicate, Consumer, Comparable, Supplier,..

        //way 1 : traditional way to create subclass of functional interface
        class RunnableIml implements Runnable {
            @Override
            public void run() {
                System.out.println("runnning...........");
            }
        }
        Runnable runnable = new RunnableIml();
        runnable.run();

        //way 2 : anonymous class  way to create subclass of functional interface
        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("runnning 111...........");
            }
        };
        runnable1.run();


    }
}
