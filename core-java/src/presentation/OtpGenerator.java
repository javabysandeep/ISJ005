package presentation;

import java.util.Random;
import java.util.stream.IntStream;

public class OtpGenerator {
    public static void main(String[] args) {
        Random random=new Random();

        System.out.println("Otp is "+random.nextInt(9999));
        
    }
}
