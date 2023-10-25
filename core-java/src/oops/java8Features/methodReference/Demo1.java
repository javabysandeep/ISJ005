package oops.java8Features.methodReference;

public class Demo1 {
    public static void display(){
        System.out.println("It is printing something");
    }

    public static void main(String[] args) {
        //way 1 : traditional way
        class Task implements Runnable {
            @Override
            public void run() {
                System.out.println("Traditional way : run");
            }
        }
        Runnable runnable = new Task();
        runnable.run();

        //way 2 : anonymous class way
        Runnable anonymous = new Runnable() {
            @Override
            public void run() {
                System.out.println("Anonymous way : run");
            }
        };
        anonymous.run();

        //way 3 : Lambda expression
        Runnable lambda = ()-> {
            System.out.println("Lambda way : run");
        };
        lambda.run();

        //way 4 : method reference
        Runnable methodReference = Demo1::display;
        methodReference.run();
    }
}
