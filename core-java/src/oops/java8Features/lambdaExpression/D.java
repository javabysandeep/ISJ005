package oops.java8Features.lambdaExpression;

public interface D {
    int add(int number1, int number2);

    public static void main(String[] args) {
        D d = (number1, number2) -> number1 + number2;
        System.out.println(d.add(100, 200));

    }
}
