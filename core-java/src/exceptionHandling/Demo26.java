package exceptionHandling;

import java.io.File;
import java.io.IOException;

public class Demo26 {
    public static void main(String[] args) {
        try {
            m1();
        } catch (IOException e) {
            System.out.println("exception handled in main");
        }
    }

    private static void m1() throws IOException {
        m2();
    }

    private static void m2() throws IOException {
        m3();
    }

    private static void m3() throws IOException {
        m4();
    }

    private static void m4() throws IOException {
        File file = new File("pqr.txt");
        file.createNewFile();
    }

}
