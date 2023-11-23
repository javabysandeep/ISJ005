package exceptionHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Demo33TryWithResources {
    public static void main(String[] args) {
        File file = new File("xyz.txt");

        try (FileInputStream fileInputStream = new FileInputStream(file)) {
            int data = fileInputStream.read();
            while (data != -1) {
                System.out.print((char) data);
                data = fileInputStream.read();
            }
        } catch (IOException e) {
            System.out.println("issue " + e.getMessage());
        }

    }
}
