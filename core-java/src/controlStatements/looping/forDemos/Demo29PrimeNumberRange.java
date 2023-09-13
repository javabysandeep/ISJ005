package controlStatements.looping.forDemos;

public class Demo29PrimeNumberRange {
    public static void main(String[] args) {
        for (int number = 1; number <= 1000; number++) {
            boolean isPrime = true;
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(number);
            }
        }
    }
}
