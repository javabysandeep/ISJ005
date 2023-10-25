package oops.java8Features.methodReference;

public class Demo2 {
    interface AdditionService {
        int add(int number1, int number2);
    }

    public static void main(String[] args) {
        //way 1 : traditional way
        class AdditionServiceImpl implements AdditionService {
            @Override
            public int add(int number1, int number2) {
                return number1 + number2;
            }
        }
        AdditionService additionService = new AdditionServiceImpl();
        System.out.println(additionService.add(100, 200));

        //way 2 : anonymous way
        AdditionService additionService1 = new AdditionService() {
            @Override
            public int add(int number1, int number2) {
                return number1 + number2;
            }
        };
        System.out.println(additionService1.add(100, 200));


        //way 3 : lambda expression way
        AdditionService additionService2 = (number1, number2) -> number1 + number2;
        System.out.println(additionService2.add(100, 200));


        //way 4 :Method Reference
        // to make reference to static method ==> ClassName::staticMethodName
        //AdditionService additionService3 = Addition::add;

        // to make reference to instance method ==> referenceName::instanceMethodName
        Addition reference = new Addition();
        AdditionService additionService3 = reference::add;
        System.out.println(additionService3.add(100, 200));
    }
}
